import json
import subprocess

def read_slug_name(slug_file):
    with open(slug_file, 'r') as file:
        return file.read().strip()

def read_cookies(input_file):
    with open(input_file, 'r') as file:
        try:
            cookies = json.load(file)
            return cookies
        except json.JSONDecodeError as e:
            print(f'Error parsing JSON: {e}')
            return []
        except Exception as e:
            print(f'An error occurred: {e}')
            return []

def create_cookie_string(cookies):
    return '; '.join(f"{cookie['name']}={cookie['value']}" for cookie in cookies)

def write_config_to_yaml(slug_name, cookie_string, output_file):
    config_content = f"""\
contest: {slug_name}
cookies: >-
  {cookie_string}
output: results
parallelDownloads: 1
waitTime: 10
rate: 1
"""
    with open(output_file, 'w') as file:
        file.write(config_content)

def run_hackerrank_dl(executable):
    try:
        result = subprocess.run([executable], check=True)
        print(f'{executable} executed successfully with return code {result.returncode}.')
    except subprocess.CalledProcessError as e:
        print(f'Error executing {executable}: {e}')

if __name__ == "__main__":
    slug_name = read_slug_name('slug_name.txt')
    cookies = read_cookies('cookies.txt')
    cookie_string = create_cookie_string(cookies)
    write_config_to_yaml(slug_name, cookie_string, 'config.yaml')

    print('Configuration written to config.yaml')

    run_hackerrank_dl('hackerrank-dl.exe')
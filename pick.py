import os
import shutil

data_folder = "data"
results_folder = "results"
output_folder = "final"

def read_file(filepath):
    with open(filepath, 'r') as f:
        return [line.strip() for line in f.readlines()]

names = read_file(os.path.join(data_folder, 'nama.txt'))
nims = read_file(os.path.join(data_folder, 'nim.txt'))
usernames = read_file(os.path.join(data_folder, 'username.txt'))

mahasiswa = {username: {'nim': nim, 'nama': name} 
             for username, nim, name in zip(usernames, nims, names)}

def move_file_to_result(username, nim, nama, challenge_name, user_file_path):
    folder_user = f"{nim}_{username}_{nama}"
    target_folder = os.path.join(output_folder, challenge_name, folder_user)
    os.makedirs(target_folder, exist_ok=True)
    target_file = os.path.join(target_folder, os.path.basename(user_file_path))
    shutil.copy(user_file_path, target_file)
    print(f"File {user_file_path} dipindahkan ke {target_file}")

def process_results():
    for date_folder in os.listdir(results_folder):
        date_path = os.path.join(results_folder, date_folder)
        if os.path.isdir(date_path):
            for challenge_folder in os.listdir(date_path):
                challenge_path = os.path.join(date_path, challenge_folder)
                if os.path.isdir(challenge_path):
                    for folder_name in ['java', 'java8', 'java15']:
                        folder_path = os.path.join(challenge_path, folder_name)
                        if os.path.isdir(folder_path):
                            for file_name in os.listdir(folder_path):
                                user_file_path = os.path.join(folder_path, file_name)
                                if os.path.isfile(user_file_path):
                                    username_from_file = os.path.splitext(file_name)[0]
                                    if username_from_file in mahasiswa:
                                        nim, nama = mahasiswa[username_from_file]['nim'], mahasiswa[username_from_file]['nama']
                                        move_file_to_result(username_from_file, nim, nama, challenge_folder, user_file_path)

process_results()
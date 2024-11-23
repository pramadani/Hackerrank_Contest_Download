**Simplified HackerRank Contest Submission Downloader**

---

## To Do
1. Enter student names in `data/nama.txt` in order.
2. Enter student NIMs in `data/nim.txt` in order.
3. Enter student usernames in `data/username.txt` in order.

## Cookies Config
1. Go to the contest page (ensure you are the admin of the contest).
2. Download the Cookie Editor extension for your browser to make copying cookies easier.
3. Export the cookies as JSON.
4. Paste the JSON into `config/cookies.txt`.

## Slug Name Config
1. Copy the part of the contest URL, excluding "https://www.hackerrank.com/".
2. Paste it into `config/slug_name.txt`.

## How to Run
1. Ensure the `nama`, `nim`, and `username` files are set up properly.
2. Ensure the `slug_name` and `cookies` files are set up correctly.
3. Run `python download.py` to download the submissions first.
4. Run `python pick.py` to process the results and organize them neatly.

---

Reference:  
[https://github.com/kasvith/hackerrank-dl](https://github.com/kasvith/hackerrank-dl)
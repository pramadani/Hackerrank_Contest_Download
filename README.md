Simplified HackerRank contest submission downloader.

---

## Cookies Config
1. Go to the contest page (make sure you are the admin of the contest).
2. Download the Cookie Editor extension in your browser. It helps in copying the cookies easily.
3. Export > JSON.
4. Paste it into `config/cookies.txt`.

## Slug Name Config
1. Copy the part of the contest URL excluding "https://www.hackerrank.com/".
2. Paste it into `config/slug_name.txt`.

## How to Run
1. Ensure that Python is installed.
2. Make sure that the slug name and cookies have been set up properly.
3. `python download.py`.
4. `python pick.py`.

---

Reference:  
[https://github.com/kasvith/hackerrank-dl](https://github.com/kasvith/hackerrank-dl)
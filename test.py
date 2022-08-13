import re
from flask import Flask
test = Flask(__name__)


@test.route('/')
def ishu():
    return 'Hello World!'


@test.route('/product')
def product():
    return 'Products Page'


if __name__ == "__main__":
    test.run(debug=True, port=8000)

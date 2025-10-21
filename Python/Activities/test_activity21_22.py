import pytest

# addition test
@pytest.mark.activity
def test_addition():
    num1=10
    num2=20
    sum=num1+num2
    assert sum==30

# subtraction test
@pytest.mark.activity
def test_subtraction():
    num1=45
    num2=5
    sub=num1-num2
    assert sub==38

# Multiplication test
@pytest.mark.activity
def test_multiplication():
    num1=30
    num2=2
    mul=num1*num2
    assert mul==60

# Division test
@pytest.mark.activity
def test_division():
    num1=100
    num2=5
    div=num1/num2
    assert div==20
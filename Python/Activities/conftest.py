import pytest

@pytest.fixture
def numlist():
    intlist=[0,1,2,3,4,5,6,7,8,9,10]
    #intlist = range(0,11)
    return intlist

@pytest.fixture
def wallet():
    amount=0
    return amount
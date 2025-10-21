import pytest

@pytest.mark.activity
def test_sum(numlist):
    sum=0
    for num in numlist:
        sum+=num

    assert sum==55
-> This problem to get Longest Continuous Sequence of ones, by finding index of 0 and replace it by 1 to get maximum length.
---------------------------------------------------------------------------------------------------------------------------------
- So we can create map of key value {key= starting sequence index , value length of sequence} so now we have each sequence of 1’s length
- Then we can check If two consecutive sequence are separated by only one zero, we can sum current sequence value + next sequence value +1(instead of zero)
- finaly check max length and return max  

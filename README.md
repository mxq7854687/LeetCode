# LeetCode
leetcode pratice 

# 1253.[Algo] Reconstruct a 2-Row Binary Matrix
Input: upper = 2, lower = 1, colsum = [1,1,1]<br/>
Output: [[1,1,0],[0,0,1]]<br/>
Explanation: [[1,0,1],[0,1,0]], and [[0,1,1],[1,0,0]] are also correct <br/>
Step 1: init an array store upper value, if colsum>0 ? 1 : 0. 
Step 2: create array store lower value,<br/>
if colsum=2 ? 1<br/> 
else if colsum=1 ? borrow 1 from upper array until reach the upperSum (in this example is 2)<br/>
remainint set to 0.<br/>
Step 3: Check number of "1"s match the upper and lower value, return boolean.


# 1254. [Algo] Number of Closed Islands

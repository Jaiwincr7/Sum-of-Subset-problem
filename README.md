# Sum-of-Subset-problem
<h1>Class Assignment(Daa)</h1>
<hr>
<b>Name</b>:-Jaiwin Chaudhari<br>
<b>Roll no</b>:-45<br>
<b>Section</b> :-A(CSE-I)
<hr>
<b>Problem Statement</b>:-Sum of Subset problem using Dynamic Programming approach and demonstrate any two applications in the form of test cases.
<hr>
<b>Theory</b>:- An array a[ ] is given with size 'n'. Sum of Subset problem provides us with the contiguous subset of the array which provides us with maximum sum that a array can provide to the user. Subset can be of any size as problem may contain negative number which might decrease the maximum sum of the array.
<hr>
<b>Time Complexity</b>- Time Complexity for the Sum of Subset is O(n)
<hr>
<h2>Application:-</h2>
<h3>1)Computer passwords</h3>
<p>A computer needs to verify a user's identity before allowing him or her access to an account. The simplest system would have the machine keep a copy of the password in an internal file, and compare it with what the user types. A drawback is that anyone who sees the internal file could later impersonate the user.
I believe this alternative is actually implemented on some systems: the computer generates a large number (say 500) of $a_i$. They are stored in the internal file. A password is a subset of $\{1,\dots,500\}$. (in practice, there is a program to convert a normal sequence-of-symbols password to such a subset.) Instead of having the password for the user, the computer keeps the total associated with the appropriate subset. When the user types in the subset, the computer tests whether the total is correct. It does not keep a record of the subset. Thus impersonation is possible only if somebody can reconstruct the subset knowing the $a_i$ and the total.</p>
<br>
<p>Here is a example of the Computer testing the password:-</p><hr>
<h4>Screenshots</h4><img src="problem 1.png"><hr>
<p>In above example company made a profit from 6th month to the 9th month of the year. The maximum profit from the respective months was 2,10,000.
<hr>
<h3>2)Message verification</h3>
<br>
<hr>
<p>A sender (S) wants to send messages to a receiver (R). Keeping the message secret is not important. However, R wants to be sure that the message he is receiving is not from an imposter and has not been tampered with. $S$ and $R$ agree on a set of $a_i$ (say 500) and a set of totals $T_j$ (say 200). These numbers may be publicly known, but only $S$ knows which subsets of the $a_i$ correspond to which $T_j$. The message sent by $S$ is a subset of size 100 of $\{1,\dots,200\}$. He does this by sending 100 subsets of the $a_i$ corresponding to the message he wants to send.</p>
<img src="image-des.png"><hr>
<hr>
<p>Here is example of the set of frequency which combine might affect the whole frequency chain which will be received by the user.

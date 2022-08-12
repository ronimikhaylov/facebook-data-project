# facebook-data-project
Project that reads data from text file and displays what the data is trying to show
In this assignment, I  use arrays and linked lists to implement a simple version of Facebook.
This program will read a sequence of commands to create users, record that two users are friends, etc.
These commands will be read from an input file and processed one at a time. All output will be placed in the console.


• A 'name' – Create a Friend object; you may assume that no two users have the same name

• F 'name' 'name' – Record that the two specified users are friends.

• U 'name' 'name' – Record that the two specified users are no longer friends.

• L 'name' – List the friends of the specified user.

• Q 'name' 'name' – Check whether the two users are friends and display an appropriate message.

For example:

Input

A Sue

A John

A Ellen

A Mike

'call toString method on the facebook object'
F John Sue
F Ellen Sue
F Mike Sue
F Mike John
'call toString method on the facebook object'
U Sue John
'call toString method on the facebook object'
Q Ellen Mike
Q Ellen Sue
L Sue L Mike
Output
Sue is friends with:
John is friends with:
Ellen is friends with:
Mike is friends with:
Sue is friends with: Mike Ellen John 
John is friends with: Mike Sue 
Ellen is friends with: Sue
Mike is friends with: John Sue
Sue is friends with: Mike Ellen
John is friends with: Mike
Ellen is friends with: Sue
Mike is friends with: John Sue
Ellen and Mike are not friends
Ellen and Sue are friends
Sue is friends with: Mike Ellen 
Mike is friends with: John Sue

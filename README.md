# facebook-data-project

In this assignment, I  use an array of users in a facebook object and each element has a user object which contains a linked list of the users friends.  </br>

Using these data structures, this program will read a sequence of commands to create users, record that two users are friends, etc.
These commands will be read from an input file and processed one at a time. All output will be placed in the console.


• A 'name' – Create a Friend object; you may assume that no two users have the same name

• F 'name' 'name' – Record that the two specified users are friends.

• U 'name' 'name' – Record that the two specified users are no longer friends.

• L 'name' – List the friends of the specified user.

• Q 'name' 'name' – Check whether the two users are friends and display an appropriate message.

For example: <br />

Input <br />
A Sue<br />
A John <br />
A Ellen <br />
A Mike <br />

'call toString method on the facebook object' <br />
F John Sue <br />
F Ellen Sue <br />
F Mike Sue <br />
F Mike John<br />

'call toString method on the facebook object' <br />
U Sue John <br />

'call toString method on the facebook object' <br />
Q Ellen Mike <br />
Q Ellen Sue <br />
L Sue L Mike <br />

Output <br />
Sue is friends with: <br />
John is friends with: <br />
Ellen is friends with: <br />
Mike is friends with:<br />
Sue is friends with: Mike Ellen John <br />
John is friends with: Mike Sue  <br />
Ellen is friends with: Sue <br />
Mike is friends with: John Sue <br />
Sue is friends with: Mike Ellen <br />
John is friends with: Mike <br />
Ellen is friends with: Sue <br />
Mike is friends with: John Sue <br />
Ellen and Mike are not friends <br />
Ellen and Sue are friends <br />
Sue is friends with: Mike Ellen  <br />
Mike is friends with: John Sue <br />

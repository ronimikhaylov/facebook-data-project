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

For example:a <br />

Inputa <br />
A Suea <br />
A Johna <br />
A Ellena <br />
A Mikea <br />

'call toString method on the facebook object' <br />
F John Suea <br />
F Ellen Suea <br />
F Mike Suea <br />
F Mike Johna <br />

'call toString method on the facebook object' <br />
U Sue Johna <br />

'call toString method on the facebook object' <br />
Q Ellen Mikea <br />
Q Ellen Suea <br />
L Sue L Mikea <br />

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

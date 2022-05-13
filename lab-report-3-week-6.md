# Lab Report 3

## Streamlining ssh Configuration

### 1. ssh/config file edit
![image](labr3.jpg)

Here I am editing my ssh config file in order to input the hostname and the username of my ieng6 account. This enables me to just type in the host for the ssh command to directly log me in.

### 2. ssh command
![image](lab3r2.jpg)

### 3. scp command
![image](report3.jpg)

As you can see it allows me to do all the regular ssh commands the same way, just with a shorter and easier to remember host.

## Setup Github Access from ieng6

### 1. Created Keys for Github
![image](keygen4.jpg)

Here I am creating a new ssh key to be used for GitHub. It uses the ed25519 key format.

### 2. Added Key to SSH-Agent
![image](sshagent.jpg)

### 3. Added Public Key to GitHub
![image](personalssh.jpg)

The key must be added to GitHub so that pushes and pulls can be allowed through ssh.

### 4. Private Key on ieng6 Account
![image](files.jpg)

After copying the keys to the ieng6 account, it now is able to push and pull from GitHub because of the previous step.

### 5. Testing it out
![image](done.jpg)

### 6. Testing the Push command
![image](done2.jpg)

## Copy whole directories with scp -r

### 1. Copying MarkdownParse directory into SSH
![image](report3scp.jpg)

To copy a directory, you must use the scp -r command which recursively copies every file into the server. It starts with small files then slowly copies everything.

### 2. Running Tests off ieng6
![image](labreport3test.jpg)

### 3. Copying Directory and Running Tests in 1 Line
![image](labreport3test2.jpg)
![image](labreport3test3.jpg)

As you can see, you can achieve this copy in one line by first copying it, then accessing the server, compiling, and then running the tests.

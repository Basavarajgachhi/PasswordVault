# PasswordVault 

A console-based Java project that demonstrates **password encryption, secure login, and file-based access categories**.  
This project uses **Caesar Cipher encryption** and **password masking** to provide a simple, secure vault system.

##  Features
Password Registration – User can register a password, stored in encrypted form.  
Login System – Login is allowed only if the encrypted password matches.  
Password Masking – Input is hidden using `Console.readPassword`.  
File Access Categories:
  - IT Files: Java, C, Python, Testing  
  - Non-IT Files: Accountancy, Finance, Economics, History  
Encryption Logic – Caesar Cipher (shift = 3).  
Menu Driven – Easy to navigate with options to Register, Login, and Exit.  

## Technologies Used
- Java (Core Java, OOP concepts)  
- Console & Scanner (input handling)  
- File handling (simulated categories)  
- Caesar Cipher encryption algorithm  

## Prpject Structure
- Passwordvault.java   # Main Java program (encryption, login, file categories)
- README.md            # Project documentation

 ## How to Run
1. Clone this repository:
   bash
  git clone https://github.com/YOUR-USERNAME/PasswordVault.git
2. Open terminal and go to the project folder.

3. Compile the program:

 -javac Passwordvault.java

4. Run the program:

 -java Passwordvault

Sample Output
-- Welcome to PasswordVault --

1. Register your password
2. Login with your password
3. Exit
Enter your choice: 1
Enter your Password:
Password encrypted and registered successfully!

## Future Enhancements

- Store encrypted passwords in files or databases.
- Add support for multiple users.
- Use stronger encryption algorithms (like **AES** for real encryption or **SHA** for hashing passwords).



 







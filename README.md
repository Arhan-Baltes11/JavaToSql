# JavaToSql
This project is more of a self-study to see how Java reacts with SQL. Will try to look if I can make any applications related to databases in the future at some point.

### Project started on the 28th of September, 2024.

## Requirements

This program uses an independent platform version of the jdbc. Be sure to acquire the `.jar` [here](https://dev.mysql.com/downloads/connector/j/).

Afterwards, put it in a library where you're easily able to link towards it.

## Usage

1. Go to the root folder.
2. (Optional) run the following command `javac -cp "path-to-the-jdbc-driver" src/main/java/*.java`
3. Depending on the operating system, use the following:

### Windows
`java -cp ".;path-to-the-jdbc-driver" src.main.java.Main`

### Linux/MacOS
`java -cp ".:path-to-the-jdbc-driver" src.main.java.Main`
# Project: chat client server local in java

## Description
This project implements a simple chat application between a server and a client using Java Sockets. The client connects to the server, sends messages, and receives responses from the server. The chat continues until the customer sends the message "bye".

## Files

* `client.java` client code
* `server` server code

## Fonctionilty

* The server listens for connections on a specified port.
* The client connects to the server through the specified port.
* The client can send messages to the server.
* The server returns messages from the client with a "Server: " prefix.
* Communication continues until the client sends "bye".

## How to run ?

### Compilation

Rurn this command

```bash
    javac clien.java server.java
```

### Execution

1. Start the server

```bash
    java server.java
```

The server will be listening on port 12345.

2. start the client in an other terminal

```bash
    java client.java
```

## Example

### Server

```zsh
    Serveur on port 12345
    Client connect
    Client: Hello
    Client: How are you?
    Client: bye
```

### Client

```zsh
    Hello
    Server: Hello
    How are you?
    Server: How are you?
    bye
    Server: bye
```

## Possible update

* Manage multiple clients using threads.
* Add a GUI for a better user experience.
* Add logging features to track conversations.
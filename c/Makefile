# Makefile for executable stacktest

# *****************************************************
# Parameters to control Makefile operation

CC = gcc
CFLAGS = -ansi -pedantic -Wall -g

# ****************************************************
# Entries to bring the executable up to date

stacktest: stacktest.o stack.o
	$(CC) $(CFLAGS) -o stacktest stacktest.o stack.o

stacktest.o: stacktest.c stack.h
	$(CC) $(CFLAGS) -c stacktest.c

stack.o: stack.c stack.h
	$(CC) $(CFLAGS) -c stack.c

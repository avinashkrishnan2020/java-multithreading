# Daemon Thread
Daemon threads are threads that run in the background. They are not essential for the lifetime of a program. Hence, when the main program or thread ends, daemon is also forced to end.

In Java, if we don’t classify a new thread as daemon, the new thread will keep running till it finishes its task even if main threads has ended.
However, if the new thread has been classified as a daemon thread, the new thread will stop its execution when main thread has ended.
Assume we instantiated a new thread, thread1. We set thread1 as daemon by: 
`thread1.setDaemon(true);`
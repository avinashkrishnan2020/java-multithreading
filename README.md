#What is concurrent programming/concurrent execution

Imagine you are a humanoid robot with 1 CPU and have 24 hours(imagine this as 1 time period/day of your internal clock) to complete two tasks in a day- blogging and cooking.
Concurrent execution of the two tasks refers to  allocating short intervals of time out of the 24 hours for completing each task. You may take 1 hour to execute blogging, 3 hours to execute cooking and it keeps repeating.
Therefore in 1 time period, you may have spent 6 hours in total for blogging and 18 hours for cooking.
 
Now imagine you have 2 CPUs that are capable of operating independently. Imagine that each CPU has its own internal clock of 24 hours. 
Parallel execution of tasks refers to allocating 1 CPU for blogging and the other for cooking. Hence, in 1 day, you will have spent 24 hours blogging and 24 hours cooking because you were doing both at the same time, independent of each other.
# RAFT
In Search of an Understandable Consensus Algorithm
Development of a distributed systems environment. 
Building a consensus system similar to paxos protocol using the Zookeeper service and gRPC framework

The prototype is based on the research paper "In Search of an Understandable Consensus Algorithm" by Diego Ongaro and John Ousterhout

Raft is a consensus algorithm for managing a replicated
log. It produces a result equivalent to (multi-)Paxos, and
it is as efficient as Paxos, but its structure is different
from Paxos; this makes Raft more understandable than
Paxos and also provides a better foundation for building
practical systems. In order to enhance understandability,
Raft separates the key elements of consensus, such as
leader election, log replication, and safety, and it enforces
a stronger degree of coherency to reduce the number of
states that must be considered. Results from a user study
demonstrate that Raft is easier for students to learn than
Paxos. Raft also includes a new mechanism for changing
the cluster membership, which uses overlapping majorities
to guarantee safety.[1]

[1]D. Ongaro and J. Ousterhout, "In search of an understandable consensus algorithm", Proc. USENIX Conf. USENIX Annu. Tech. Conf. (USENIX ATC), pp. 305-320, 2014, [online] Available: http://dl.acm.org/citation.cfm?id=2643634.2643666.

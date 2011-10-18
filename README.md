Pimped Brisk
============

Brisk made Hadoop play nice with Cassandra, but more importantly, easy to use.
And this is critical for the Hadoop ecosystem. Datastax worked really hard and
delivered an amazing distribution.

However, they shifted their product strategy, and decided they are discontinuing
Brisk:
 - http://www.datastax.com/2011/09/two-new-offerings-today-from-datastax
 - http://www.datastax.com/2011/09/committing-hive-driver-into-apache-cassandra
 - http://www.datastax.com/2011/09/replies-to-your-feedback-on-brisk-announcement

Since Brisk is now discontinued, this fork is an effort to make Brisk work
with the latest packages of Cassandra, Pig, Hive, while retaining the original
functionnality of Brisk, that is, running MR jobs without HDFS, directly on top
of Cassandra.

Also, effort is ongoing to integrate Cascading/Cascalog as well. The end goal
would be to have an awesome Cassandra based Hadoop distribution, easy to setup
and to use.

HOWEVER, this is IN NOW WAY an effort to preempt Datastax in their endeavours.
They were nice enough to leave the sources for people to use, which we are!

If you want a professional, entreprise-grade Cassandra offering, please consider
reviewing their offerings on:
	http://www.datastax.com/products

DataStax Brisk
==============

This package contains a HDFS compatable layer (CFS) and a CassandraJobConf
which can be used to run MR jobs without HDFS or dedicated job/task trackers.

It also includes a hive-driver for accessing data in cassandra as well as a
hive meta-store implementation.

Hadoop jobs and Hive are setup to work with MR cluster.

For detailed docs please see:
    http://www.datastax.com/docs/0.8/brisk/index

You can also discuss Brisk on freenode #datastax-brisk

Required Setup
==============

On linux systems, you need to run the following as root

    echo 1 > /proc/sys/vm/overcommit_memory

This is to avoid OOM errors when tasks are spawned.

Getting Started
===============

To try it out run:

1. compile and download all dependencies

        ant

2. start cassandra with built in job/task trackers

        ./bin/brisk cassandra -t

3. view jobtracker

        http://localhost:50030

4. examine CassandraFS

        ./bin/brisk hadoop fs -lsr cfs:///

5. start hive shell or webUI

        ./bin/brisk hive

   or

        ./bin/brisk hive --service hwi

open web browser to http://localhost:9999/hwi

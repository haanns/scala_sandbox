#!/usr/bin/env bash

hadoop version

hadoop fs -command

hdfs dfs -command

hadoop fs -mkdir /hdfs/file/destination

hadoop fs -put /source/file/locatoin /hdfs/file/destination

hadoop fs -copyFromLocal /source/file/location /hdfs/file/destination

hadoop fs -ls /hdfs/file/location

hadoop fs -getmerge /hdfs/result/location/folder /local/merged/file.csv
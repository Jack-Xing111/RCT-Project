#!/bin/bash
java -jar Jack-demo.jar output.sctx input.txt
java -jar kico-osx.jar -s=de.cau.cs.kieler.sccharts.simulation.netlist.java output.sctx

package org.example.Inner.task2;

public class Main {
    static void main() throws Exception {
        Computer computer = new Computer("MinchonWorld", true);
        Computer.Processor processor = computer.new Processor();
        processor.executeTask("FireFox");
        processor.executeTask("Roblox");
        Computer.Processor processor2 = computer.new Processor();
        processor2.executeTask("Create world");
        computer.setPowerOn(false);
        processor.executeTask("Create world");
    }
}

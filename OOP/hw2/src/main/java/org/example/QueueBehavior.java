package org.example;

interface QueueBehavior {
    void addToQueue(Client client);
    void removeFromQueue(Client client);
    void giveOrder(Client client);
    void takeOrder(Client client);
}
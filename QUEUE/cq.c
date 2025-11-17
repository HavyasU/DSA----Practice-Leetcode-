#include <stdio.h>
#include <math.h>
#include <stdlib.h>

#define max 5

struct Queue
{
    int rear, front;
    int item[max];
} q;

void main()
{
    q.rear = max - 1;
    q.front = max - 1;
}

void insert(int x)
{
    if ((q.rear + 1) % max == q.front)
    {
        // "Overflow"
    }
    else
    {
        q.rear = (q.rear + 1) % max;
        // q.rear = [x]
    }
}

void delete()
{
    // if (q.front == q.rear){
    // Underflow
    // }else{
    // return q.item[q.front]
    // }
}
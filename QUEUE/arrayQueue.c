#include <stdio.h>
#include <math.h>
#include <stdlib.h>

#define max 5

struct Queue
{
    int rear, front;
    int item[max];
} q;

void insert();
int delete();
int isempty();

void push(int x)
{
    if (q.rear == max - 1)
    {
        printf("Overflow");
    }
    else
    {
        q.item[++q.rear] = x;
    }
}

int delete()
{
    if (empty())
    {
        printf("UNderFlow");
        return -1;
    }
    else
    {
        return q.item[q.front++];
    }
}

void empty()
{
    if (q.rear < q.front)
    {
        return 0;
    }
    else
    {
        return 1;
    }
}
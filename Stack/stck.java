#include <stdio.h>
#include <stdlib.h>

#define MAX 5      // Maximum size of stack

int stack[MAX];
int top = -1;     // Stack starts empty

// Function to push an element into the stack
void push(int x) {
    if (top == MAX - 1) {
        printf("Stack Overflow! Cannot push %d\n", x);
        return;
    }
    top++;
    stack[top] = x;
    printf("%d pushed to stack.\n", x);
}

// Function to pop the top element from the stack
int pop() {
    if (top == -1) {
        printf("Stack Underflow! Nothing to pop.\n");
        return -1;
    }
    int val = stack[top];
    top--;
    printf("Popped: %d\n", val);
    return val;
}

// Function to view the top element (peek)
int peek() {
    if (top == -1) {
        printf("Stack is empty.\n");
        return -1;
    }
    return stack[top];
}

// Function to display all elements
void display() {
    if (top == -1) {
        printf("Stack is empty.\n");
        return;
    }
    printf("Stack elements: ");
    for (int i = 0; i <= top; i++) {
        printf("%d ", stack[i]);
    }
    printf("\n");
}

int main() {
    int choice, value;

    while (1) {
        printf("\n--- Stack Menu ---\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to push: ");
                scanf("%d", &value);
                push(value);
                break;

            case 2:
                pop();
                break;

            case 3:
                value = peek();
                if (value != -1)
                    printf("Top element: %d\n", value);
                break;

            case 4:
                display();
                break;

            case 5:
                exit(0);

            default:
                printf("Invalid choice!\n");
        }
    }

    return 0;
}

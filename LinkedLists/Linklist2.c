#include<stdio.h>
#include<stdlib.h>

struct polynomial {
	int coeff;
	int pow;
	struct polynomial* next;
};

int main(void) {
	struct polynomial* start;
	struct polynomial* first = NULL;
	struct polynomial* second = NULL;
	struct polynomial* third = NULL;

	first = malloc(sizeof(struct polynomial));
	second = malloc(sizeof(struct polynomial));
	third = malloc(sizeof(struct polynomial));

	//3x^2+7x+2=0

	first->coeff = 3;
	first->pow = 2;
	second->coeff = 7;
	second->pow = 1;
	third->coeff = 2;
	third->pow = 0;

	start = first;
	first->next = second;
	second->next = third;
	third->next = NULL;

	struct polynomial* p = start;
	while (p != NULL) {
		if (p->next==NULL) {
			printf("%d=0", p->coeff);
		}
		else {
			printf("(%d)x^%d+", p->coeff, p->pow);
		}
		p = p->next;
	}
	return 0;
}

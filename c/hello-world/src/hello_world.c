#include "hello_world.h"


void hello(char *buf, size_t len, const char *name) {
    if (strlen(name) == 0) {
	strcpy(buf, "Hello, World!");
    } else if (strlen(name) < len) {
	sprintf(buf, "Hello, %s!", name);
    }
}

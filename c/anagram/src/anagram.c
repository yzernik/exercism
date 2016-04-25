#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include "anagram.h"


int is_anagram(char *s, char *t) {
    int chars[256];
    int same_word_ci = 1;

    if (strlen(s) != strlen(t)) {
	return 0;
    }
    
    if (strcmp(s, t) == 0) {
	return 0;
    }

    for(size_t i = 0; i < strlen(s); i++) {
	if (tolower(s[i]) != tolower(t[i])) {
	    same_word_ci = 0;
	}
    }
    
    for(size_t c = 0; c < 256; c++) {
	chars[c] = 0;
    }

    for(size_t i = 0; i < strlen(s); i++) {
	chars[tolower(s[i])]++;
	chars[tolower(t[i])]--;
    }

    for(size_t c = 0; c < 256; c++) {
	if(chars[c] != 0){
	    return 0;
	}
    }

    if (same_word_ci) {
	return 0;
    }

    return 1;
}

struct Vector anagrams_for(char *word, struct Vector candidates) {
    int matches[candidates.size];
    int num_matches = 0;
    char (*outputs)[MAX_STR_LEN];

    for (size_t i = 0; i < candidates.size; i++) {
	if (is_anagram(word, candidates.vec[i])) {
	    matches[i] = 1;
	    num_matches++;
	}
    }

    outputs = malloc(num_matches * sizeof(char *) * MAX_STR_LEN);
    
    int last = 0;
    for (int i = 0; i < candidates.size; i++) {
	if (matches[i]) {
	    strcpy(outputs[last], candidates.vec[i]);
	    last++;
	}
    }

    struct Vector ret = {
	outputs,
	num_matches
    };

    return ret;
}

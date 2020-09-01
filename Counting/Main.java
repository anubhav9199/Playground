#include <stdio.h>
int main() {
    char line[300];
    int vowels, consonant, digit, space, symbols;

    vowels = consonant = digit = space = symbols = 0;
    fgets(line, sizeof(line), stdin);

    for (int i = 0; line[i] != '\0'; ++i) {
        if (line[i] == 'a' || line[i] == 'e' || line[i] == 'i' ||
            line[i] == 'o' || line[i] == 'u' || line[i] == 'A' ||
            line[i] == 'E' || line[i] == 'I' || line[i] == 'O' ||
            line[i] == 'U') {
            ++vowels;
        } else if ((line[i] >= 'a' && line[i] <= 'z') || (line[i] >= 'A' && line[i] <= 'Z')) {
            ++consonant;
        } else if (line[i] >= '0' && line[i] <= '9') {
            ++digit;
        } else if (line[i] == ' ') {
            ++space;
        }
      	else{
          	++symbols;
        }
    }

    printf("Vowels:%d", vowels);
    printf("\nConsonants:%d", consonant);
  	printf("\nWhite Spaces:%d", space);
    printf("\nDigits:%d", digit);
  	printf("\nSymbols:%d", symbols);
    return 0;
}
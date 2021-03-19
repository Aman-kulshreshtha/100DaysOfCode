#include <stdio.h>
int main() {
     char str[1000];
    scanf("%s", str);
    int n = 0 ;
    while(str[n] != '\0') {
       n++;
    }

    char fwdShift [1000];
    fwdShift[0] = str[n-1];
    for(int i = 1 ; i < n; i++) {
        fwdShift[i] = str[i-1];
    }

    fwdShift[n] = '\0';
    

    char bkwdShift[1000];
    char ch = str[0];
    int i = 0 ;
    for(;i<n-1;i++) {
        bkwdShift[i] = str[i+1];
    }
    bkwdShift[n-1] = ch;
    bkwdShift[n] = '\0';
    

    int isEqual = 1;
    for(int i = 0 ; i < n ;i++) {
        if(fwdShift[i] != bkwdShift[i] ) {
            isEqual = 0;
        }
    }

    printf("%d", isEqual);
    
    
    return 0;
}
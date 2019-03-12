package br.com.concrete

class Palindrome {
    fun isPalindrome(inputString: String): Boolean {
        if (!inputString.isEmpty()) {
            val firstChar = inputString[0]
            val lastChar = inputString[inputString.length - 1]
            val mid = inputString.substring(1, inputString.length - 1)
            return (firstChar == lastChar) && isPalindrome(mid)
        }
        return true
    }
}

package br.com.concrete

import org.junit.jupiter.api.Test

class PalindromeTest {
    @Test
    fun `When Empty String then accept`() {
        val palindrome = Palindrome()
        assert(palindrome.isPalindrome(""))
    }

    @Test
    fun `When String is NOT Palindrome`() {
        val nonPalindromeStr = Palindrome()
        assert(!nonPalindromeStr.isPalindrome("123"))
    }

    @Test
    fun `When String is ALMOST Palindrome`() {
        val nonPalindromeStr = Palindrome()
        assert(!nonPalindromeStr.isPalindrome("1231"))
    }

    @Test
    fun `When String IS Palindrome`() {
        val palindrome = Palindrome()
        assert(palindrome.isPalindrome("123321"))
    }
}

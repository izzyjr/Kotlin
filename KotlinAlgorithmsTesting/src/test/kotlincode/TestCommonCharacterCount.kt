package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestCommonCharacterCount {

    private var algorithm: CommonCharacterCount = CommonCharacterCount()

    @Test
    fun testCommonCharacterCount() {
        var actualResult: Int = algorithm.commonCharacterCount("aabcc", "adcaa")
        Assert.assertEquals(actualResult, 3)
    }

    @Test
    fun testCommonCharacterCount1() {
        var actualResult: Int = algorithm.commonCharacterCount("abcdefghxyzttw", "hgfedcbaabcwwt")
        Assert.assertEquals(actualResult, 10)
    }

}
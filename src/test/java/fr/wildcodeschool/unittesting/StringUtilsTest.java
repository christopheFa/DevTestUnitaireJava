package fr.wildcodeschool.unittesting;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testParameterNull() {
        Assert.assertTrue("failure - should be true", true);
        Assert.assertNotNull("should not be null", StringUtils.vowels(""));
        Assert.assertNotNull("should not be null", StringUtils.vowels(null));
    }

    @Test
    public void testVowels() {

        Assert.assertTrue("failure - should be true", true);
        Assert.assertEquals(StringUtils.vowels("voyelle"),"oyee");
        Assert.assertEquals(StringUtils.vowels("VOYELLE"),"OYEE");
        Assert.assertEquals(StringUtils.vowels("gnmt"),"");
        Assert.assertEquals(StringUtils.vowels("oUuy"),"oUuy");
        Assert.assertEquals(StringUtils.vowels("aeiouy"),"aeiouy");
        Assert.assertEquals(StringUtils.vowels("Terminer"),"eie");


    }

    @Test
    public void testUniqueVowels() {
        Assert.assertTrue("failure - should be true", true);
        Assert.assertEquals(StringUtils.uniqueVowels("aeeettEEEiooOuUy"),"aeiouy");
        Assert.assertEquals(StringUtils.uniqueVowels("ppppAeIaEiAEIaei"),"AeI");
        Assert.assertEquals(StringUtils.uniqueVowels("aAEeeeyEEEiIIooOuUYYYy"),"aEyiou");
        Assert.assertEquals(StringUtils.uniqueVowels("Ppprtsm"),"");
    }


}

package com.company;

public class Main {

    public static void main(String[] args) {


        //*************************************
        //************LONG*********************
        //*************************************

        //myLongValue = 100L; //use capital L at the end to inform computer that it is a long number
        // this works with out an L because 100 fits into an integer so would still work. If the number was larger than the maximum integer number it would no longer work
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + (myMinLongValue));
        System.out.println("Long maximum value = " + (myMaxLongValue));
        //Long minimum value = -9223372036854775808
        //Long maximum value = 9223372036854775807
        // occupies 64bits (64 width)
        //long numbers can store 2^63 = 9.223372e+18


        //*************************************
        //************INT*********************
        //*************************************

        int myValue = 20;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        //Integer Minimum Value = -2147483648
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //Integer Maximum Value = 2147483647
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));
        //(Busted Minimum Value = 2147483647) <- This is an underflow e.g too low for the computers range of ints therefore it becomes a positive number
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        //(Busted Maximum Value + 1) = -2147483648 <- This is an overflow e.g too high for the computers range of ints therefore it becomes a minus

        int myMaxIntTest = 2147483647;
        //int myMaxIntTest2 = 2147483648; //red curly line underneath because of overflow - the value is too high for ints
        int myMaxIntTest3 = 2_147_483_647; //under scores can be used in place of where commas would normally go in numbers
        //occupies 32 bits (width of 32)


        //*************************************
        //************SHORT*********************
        //*************************************


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + (myMinShortValue));
        System.out.println("Short maximum value = " + (myMaxShortValue));
        //Short minimum value = -32768
        //Short maximum value = 32767
        // occupies 16 bits width of 16bits


        //*************************************
        //************BYTE*********************
        //*************************************


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + (myMinByteValue));
        System.out.println("Byte maximum value = " + (myMaxByteValue));
        //Byte minimum value = -128   use this to save memory and performance reasons
        //Byte maximum value = 127
        //occupies 8 bits (width of 8)




        int myTotal = (myMinIntValue/2);

        //byte myNewByteValue = (myMinByteValue / 2); // default whole number is an int therefore the numbers in the brackets are also an int
        // use 'casting' to convert a number from one type to another
        // to do casting put the type we want the number to be in parenthesis like this: (byte)(myMinByteValue/2)
        byte myNewByteValue2 = (byte) (myMinByteValue / 2); //done with casting


        //short myNewShortValue = (myMinShortValue / 2); //results in an error
        short myNewShortValue2 = (short) (myMinShortValue / 2); //done with casting




        //***************************************************************************************************************
        //************ALWAYS USE AN INT VALUE UNLESS THERE IS A GOOD REASON NOT TO***************************************
        //***************************************************************************************************************


        byte myByteNumber = 10;
        short myShortNumber = 20;
        int myIntNumber = 100;
        long myLongNumber = 50000L + 10L * (myByteNumber + myShortNumber + myIntNumber);
        System.out.println(myLongNumber);

        //short shortTotal = (1000 + 10 * (myByteNumber + myShortNumber + myIntNumber)); //needs casting
        short shortTotal = (short) (1000 + 10 * (myByteNumber + myShortNumber + myIntNumber));
    }
}

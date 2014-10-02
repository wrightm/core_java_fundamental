package chapter_7_graphics_programming.listFonts;

import java.awt.*;

/**
 * Created by wrightm on 02/10/2014.
 */
public class ListFonts {
    public static void main(String[] args)
    {
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();

        for (String fontName : fontNames)
            System.out.println(fontName);
    }
}

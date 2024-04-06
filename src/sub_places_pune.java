/*
 * MIT License
 *
 * Copyright (c) 2024 Sutar
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

public class sub_places_pune {

    public static void punesubplace()
    {
        String header = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Destinations in Pune.png";

        String basePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\pune_subplaces\\";
        String[] places = {
                "Dagadusheth Halwai Ganpati Temple",
                "Katraj Jain Temple",
                "Khadakwasla Dam",
                "MCA Cricket Stadium",
                "National War Museum",
                "Neelkantheshwar",
                "Rajgad Fort",
                "Rajiv Gandhi Zoological Park",
                "Sarasbaug Ganpati Temple",
                "Shaniwar Wada",
                "Sinhagad Fort",
                "Torna Fort"
        };

        String[] placePaths = new String[places.length];
        for (int i = 0; i < places.length; i++) {
            placePaths[i] = basePath + places[i] + ".png";
        }

        String[] placeWebs = {

        };


        places_func.initializeFrame(header, placePaths, placeWebs,places);
    }

    public static void main(String[] args) {
        sub_places_pune.punesubplace();
    }
}

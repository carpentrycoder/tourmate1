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

public class subplaces_mumbai {

    public static void mumbai_subplaces()
    {
        String header = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Destinations in Mumbai.png";

        String basePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\mumbai_subplaces\\";
        String[] places = {
                "Bandra-Worli Sea-Link",
                "Chhatrapati Shivaji Maharaj Terminus",
                "Colaba",
                "Elephanta Caves",
                "Gateway of India",
                "Juhu Beach",
                "Mumba Devi Temple",
                "Nariman Point",
                "Sanjay Gandhi National Park",
                "Shivaji Park",
                "Shree Siddhivinayak",
                "Wankhede Stadium"
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
        subplaces_mumbai.mumbai_subplaces();
    }
}

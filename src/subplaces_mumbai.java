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
                "https://www.tripadvisor.in/Attraction_Review-g304554-d2704519-Reviews-Bandra_Worli_Sea_Link-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d321412-Reviews-Chhatrapati_Shivaji_Terminus-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d311661-Reviews-Colaba-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d311664-Reviews-Elephanta_Caves-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d311667-Reviews-Gateway_of_India-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d321424-Reviews-Juhu_Beach-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d324640-Reviews-Mumba_Devi_Temple-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d3783379-Reviews-Nariman_Point-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d324632-Reviews-Sanjay_Gandhi_National_Park-Mumbai_Maharashtra.html#REVIEWS",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d811527-Reviews-Shivaji_Park-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d622586-Reviews-Shree_Siddhivinayak-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g304554-d5792109-Reviews-Wankhede_Stadium-Mumbai_Maharashtra.html"
        };



        places_func.initializeFrame(header, placePaths, placeWebs,places);
    }

    public static void main(String[] args) {
        subplaces_mumbai.mumbai_subplaces();
    }
}

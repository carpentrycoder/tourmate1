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

public class sub_places_nashik {
    public static void nashik_subplace() {
        // Create an instance of places_func


        // Call the initializeFrame method
        String header = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Destinations in Pune.png";
        String[] placePaths = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Anjneri Hills.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Camel Valley.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Dugarwadi Waterfall.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Gangapur Dam.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Gargoti Mineral Museum.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Gondeshwar Temple.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Harihar Fort.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Kalaram Temple.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Kalsubai Peak.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Pandavleni Caves.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Sula Vineyards.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_subplaces\\Trimbakeshwar Shiva Temple.png"
        };
        // Paths to place images
        String[] placeWebs = {
                "https://www.tripadvisor.in/Attraction_Review-g303883-d2711731-Reviews-Anjneri_Hill-Nashik_Nashik_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g1156428-d4089209-Reviews-Camel_Valley-Igatpuri_Nashik_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g303883-d8059951-Reviews-Dugarwadi_Waterfall-Nashik_Nashik_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g303883-d4152203-Reviews-Gangapur_Dam-Nashik_Nashik_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g1146801-d3961602-Reviews-Gargoti_Mineral_Museum-Sinnar_Nashik_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g1146801-d4753780-Reviews-Gondeshwar_Temple-Sinnar_Nashik_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g303883-d9835170-Reviews-Harihar_Fort-Nashik_Nashik_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g303883-d2009112-Reviews-Kalaram_Temple-Nashik_Nashik_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297648-d3705264-Reviews-Kalsubai_Peak-Maharashtra.html",
                "https://www.tripadvisor.in/AttractionProductReview-g304554-d15000805-Nasik_Winery_Tour_Pandavleni_Caves_Mumbai_Nasik_Mumbai-Mumbai_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g303883-d497960-Reviews-Sula_Vineyards-Nashik_Nashik_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g2454002-d2009105-Reviews-Trimbakeshwar_Shiva_Temple-Trimbak_Nashik_District_Maharashtra.html"
        };

        // Web URLs for places

        String[] placelbl = {
                "Anjneri Hills",
                "Camel Valley",
                "Dugarwadi Waterfall",
                "Gangapur Dam",
                "Gargoti Museum",
                "Gondeshwar Temple",
                "Harihar Fort",
                "Kalaram Temple",
                "Kalsubai Peak",
                "Pandavleni Caves",
                "Sula Vineyards",
                "Trimbakeshwar Temple"
        };

        places_func.initializeFrame(header, placePaths, placeWebs,placelbl);
    }

    public static void main(String[] args)
    {
        sub_places_nashik.nashik_subplace();
    }
}

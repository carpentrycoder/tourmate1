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

public class subplaces_smbj {

    public static void smbj_subplaces()
    {
        String header = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Destinations in Chhatrapati Sambhaji Nagar.png";

        String basePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\smbj_subplaces\\";
        String[] places = {
                "Bhadra Maruti",
                "Bibi Ka Maqbara",
                "Chhatrapati Shivaji Maharaj Museum",
                "Daulatabad Fort",
                "Ellora Caves",
                "H2O Water Park",
                "Jayakwadi Dam",
                "Panchakki(Water Mill)",
                "Salim Ali Lake",
                "Siddharth Garden",
                "Soneri Mahal",
                "Tomb of Mughal Emperor"
        };


        String[] placePaths = new String[places.length];
        for (int i = 0; i < places.length; i++) {
            placePaths[i] = basePath + places[i] + ".png";
        }

        String[] placeWebs = {
                "https://www.tripadvisor.in/Attraction_Review-g297649-d3659888-Reviews-Bhadra_Maruti-Aurangabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297649-d321438-Reviews-Bibi_Ka_Maqbara-Aurangabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297649-d7175755-Reviews-Chatrapati_Shivaji_Museum-Aurangabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g7591475-d1024044-Reviews-Daulatabad_Fort-Daulatabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297649-d317351-Reviews-Ellora_Caves-Aurangabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297649-d4139034-Reviews-H2O_Water_Park-Aurangabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297649-d5787919-Reviews-Jayakwadi_Dam-Aurangabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297649-d3731036-Reviews-Panchakki_Water_Mill-Aurangabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297649-d24164686-Reviews-Salim_Ali_Lake-Aurangabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297649-d3913043-Reviews-Siddharth_Garden-Aurangabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297649-d3346462-Reviews-Sunheri_Mahal-Aurangabad_Aurangabad_District_Maharashtra.html",
                "https://www.tripadvisor.in/Attraction_Review-g297649-d6602269-Reviews-Tomb_of_Mughal_Emperor_Aurangzeb-Aurangabad_Aurangabad_District_Maharashtra.html"
        };



        places_func.initializeFrame(header, placePaths, placeWebs,places);
    }

    public static void main(String[] args) {
        subplaces_smbj.smbj_subplaces();
    }
}

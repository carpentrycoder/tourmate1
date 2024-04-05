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
public class Nashik_restaurents {

    public static void nashik_restro()
    {
        String maplink = "https://www.google.com/maps/search/Restaurants+in+Nashik/@19.985219,73.7279252,13z/data=!3m1!4b1?entry=ttu";
        String[] restaurantLinks = {
                "https://www.google.com/maps/place/Bon+Vivant/@20.0066439,72.6173651,9z/data=!4m10!1m2!2m1!1sBon+Vivant!3m6!1s0x1157342f01427d35:0x9ba9b5b4e0ae39cd!8m2!3d20.0066439!4d73.7709296!15sCgpCb24gVml2YW50WgwiCmJvbiB2aXZhbnSSAQpyZXN0YXVyYW504AEA!16s%2Fg%2F11b778p6_k?entry=ttu",
                "https://www.google.com/maps/place/Curry+Leaves+Pure+Veg+,+Jehan+Circle/@20.0067855,72.6173447,9z/data=!4m10!1m2!2m1!1sCurry+Leaves!3m6!1s0x3bddeb8ee29ad63b:0xcd7c697687a72dbc!8m2!3d20.0127146!4d73.7556801!15sCgxDdXJyeSBMZWF2ZXNaDiIMY3VycnkgbGVhdmVzkgERaW5kaWFuX3Jlc3RhdXJhbnTgAQA!16s%2Fg%2F1hjggg4lz?entry=ttu",
                "https://www.google.com/maps/place/Palm+Shells/@20.0217035,73.76468,17z/data=!4m6!3m5!1s0x3bddeb94ce8f30a7:0x5782d52dea54885a!8m2!3d20.0216985!4d73.7672549!16s%2Fg%2F11cln159pb?entry=ttu",
                "https://www.google.com/maps/place/Veg+Aroma/@20.0120574,73.728164,15z/data=!4m10!1m2!2m1!1sVeg+Aroma!3m6!1s0x3bddec764bca5f9b:0xb1212fdff79c12ef!8m2!3d20.0120574!4d73.7461884!15sCglWZWcgQXJvbWFaCyIJdmVnIGFyb21hkgEVdmVnZXRhcmlhbl9yZXN0YXVyYW504AEA!16s%2Fg%2F1pv19trsn?entry=ttu",
                "https://www.google.com/maps/search/Barbeque+Ville/@19.2653161,73.1802364,9z/data=!3m1!4b1?entry=ttu",
                "https://www.google.com/maps/place/Hotel+Panchavati+Yatri/@20.0069271,72.6173243,9z/data=!4m13!1m2!2m1!1sHotel+Panchavati!3m9!1s0x3bdd9557f1d75fbb:0x6f01bdeaf0aaf934!5m2!4m1!1i2!8m2!3d20.0056771!4d73.7855302!15sChBIb3RlbCBQYW5jaGF2YXRpWhIiEGhvdGVsIHBhbmNoYXZhdGmSAQVob3RlbJoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VOUE5EWlBaMnBSUlJBQuABAA!16s%2Fg%2F11b70kqz6j?entry=ttu",
                "https://www.google.com/maps/place/Luscious+Layers/@20.009116,73.7550311,17z/data=!3m1!4b1!4m6!3m5!1s0x3bddeb9ba26e4f13:0x6ac83195cba093fc!8m2!3d20.009111!4d73.757606!16s%2Fg%2F11t7481lsn?entry=ttu",
                "https://www.google.com/maps/place/Sadhana+Rajeshahi/@20.0215212,73.6491227,13z/data=!4m10!1m2!2m1!1sSadhana+Restaurant!3m6!1s0x3bdd9569f0d3bc69:0xbccb3ec35994d89d!8m2!3d20.0215212!4d73.7212205!15sChJTYWRoYW5hIFJlc3RhdXJhbnRaFCISc2FkaGFuYSByZXN0YXVyYW50kgESbWFyYXRoaV9yZXN0YXVyYW50mgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVU5WTms5WVUzZFJSUkFC4AEA!16s%2Fg%2F11f7cbhv2c?entry=ttu",
                "https://www.google.com/maps/place/Mantra+Fine+Dine+Restaurant+%26+Bar/@20.0109215,73.7581421,17z/data=!3m1!4b1!4m6!3m5!1s0x3bddeb42453006cd:0xc7262690204565ad!8m2!3d20.0109165!4d73.760717!16s%2Fg%2F11gh82x25c?entry=ttu",
                "https://www.google.com/maps/place/The+SSK+Solitaire+Hotel+and+Banquets/@19.9911867,73.7735018,17z/data=!3m1!4b1!4m9!3m8!1s0x3bddeb0dcb37ae5b:0xe22c9db9b749b608!5m2!4m1!1i2!8m2!3d19.9911817!4d73.7760767!16s%2Fg%2F11b5wqf6hv?entry=ttu",
                "https://www.google.com/maps/place/Curry+Leaves+Pure+Veg+,+Jehan+Circle/@20.0067855,72.6173447,9z/data=!4m10!1m2!2m1!1sCurry+Leaves!3m6!1s0x3bddeb8ee29ad63b:0xcd7c697687a72dbc!8m2!3d20.0127146!4d73.7556801!15sCgxDdXJyeSBMZWF2ZXNaDiIMY3VycnkgbGVhdmVzkgERaW5kaWFuX3Jlc3RhdXJhbnTgAQA!16s%2Fg%2F1hjggg4lz?entry=ttu",
                "https://www.google.com/maps/place/Mantra+Fine+Dine+Restaurant+%26+Bar/@20.0109215,73.7581421,17z/data=!3m1!4b1!4m6!3m5!1s0x3bddeb42453006cd:0xc7262690204565ad!8m2!3d20.0109165!4d73.760717!16s%2Fg%2F11gh82x25c?entry=ttu",
                "https://www.google.com/maps/place/Kokni+Darbar+Restaurant/@19.9668913,73.5787272,12z/data=!4m10!1m2!2m1!1sKokni+Darbar+Restaurant!3m6!1s0x3bddeb013af2e74b:0x49e6a71d4fdbeb09!8m2!3d19.998873!4d73.789778!15sChdLb2tuaSBEYXJiYXIgUmVzdGF1cmFudFoZIhdrb2tuaSBkYXJiYXIgcmVzdGF1cmFudJIBEmJpcnlhbmlfcmVzdGF1cmFudOABAA!16s%2Fg%2F1tmxd09v?entry=ttu",
                "https://www.google.com/maps/place/THE+TEROTALE/@19.9912708,73.7580072,17z/data=!4m6!3m5!1s0x3bddeb761da64c91:0x4609751dd55ee07a!8m2!3d19.9912658!4d73.7605821!16s%2Fg%2F11q4m1rt84?entry=ttu",
                "https://www.google.com/maps/place/Luscious+Layers/@20.009116,73.7550311,17z/data=!3m1!4b1!4m6!3m5!1s0x3bddeb9ba26e4f13:0x6ac83195cba093fc!8m2!3d20.009111!4d73.757606!16s%2Fg%2F11t7481lsn?entry=ttu",
                "https://www.google.com/maps/place/Sadhana+Rajeshahi/@20.0215212,73.6491227,13z/data=!4m10!1m2!2m1!1sSadhana+Restaurant!3m6!1s0x3bdd9569f0d3bc69:0xbccb3ec35994d89d!8m2!3d20.0215212!4d73.7212205!15sChJTYWRoYW5hIFJlc3RhdXJhbnRaFCISc2FkaGFuYSByZXN0YXVyYW50kgESbWFyYXRoaV9yZXN0YXVyYW50mgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVU5WTms5WVUzZFJSUkFC4AEA!16s%2Fg%2F11f7cbhv2c?entry=ttu",
        };
        String[] budgetFriendlyBites = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Bon Vivant.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Curry Leaves.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Palm Shells.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Veg Aroma.png"
        };

        String[] cheapEats = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Barbeque Ville.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Hotel Panchavati.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Luscious Layer.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Sadhana Restaurant.png"
        };

        String[] dinner = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Mantra Fine Dine.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\SSK Solitaire.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Curry Leaves.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Mantra Fine Dine.png"
        };

        String[] deliveryAvailable = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Kokni Darbar Restaurant.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\The Terotale.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Luscious Layer.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_pune\\Sadhana Restaurant.png"
        };



        // Call initializeFrame method from restaurent_func class
        restaurent_func.restaurenttemplate("Nashik",maplink, restaurantLinks, budgetFriendlyBites, cheapEats, dinner, deliveryAvailable);
    }

}

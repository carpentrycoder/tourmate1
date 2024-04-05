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

public class smbj_restaurents {

    public static void smbj_restro()
    {
        String maplink = "https://www.google.com/maps/search/restaurants+in+Aurangabad,+Maharashtra/@19.8762058,75.3154282,13.63z?entry=ttu";
        String[] restaurantLinks = {
                "https://www.google.com/maps/place/Amigos+Kitchen/@19.8770537,75.3561555,17z/data=!3m1!4b1!4m6!3m5!1s0x3bdba293d9d1139b:0x561ff6baa3d85381!8m2!3d19.8770487!4d75.3587304!16s%2Fg%2F11d_bbzc80?entry=ttu",
                "https://www.google.com/maps/place/Basil+Kitchen+Veg+Restaurant/@19.8783235,75.3681039,17z/data=!3m1!4b1!4m6!3m5!1s0x3bdba30d50584bf7:0x5f6aa3e942df1110!8m2!3d19.8783185!4d75.3706788!16s%2Fg%2F11scp7dgcg?entry=ttu",
                "https://www.google.com/maps/place/Chilli+Fine+Dine+By+Hotel+The+Sky+Court/@19.86136,75.3091662,17z/data=!3m1!4b1!4m6!3m5!1s0x3bdb997af434677d:0xc8684b82d7e12848!8m2!3d19.861355!4d75.3117411!16s%2Fg%2F11kj_8vlf2?entry=ttu",
                "https://www.google.com/maps/place/Dosa+Plaza/@19.8748743,75.3555956,15z/data=!4m10!1m2!2m1!1sD'Curry+House!3m6!1s0x3bdba2ee0f000001:0xabdfff827c170038!8m2!3d19.8767227!4d75.3717173!15sCg1EJ0N1cnJ5IEhvdXNlWg8iDWQgY3VycnkgaG91c2WSAQpyZXN0YXVyYW504AEA!16s%2Fg%2F11gfmw224g?entry=ttu",
                "https://www.google.com/maps/place/Amigos+Kitchen/@19.8770537,75.3561555,17z/data=!3m1!4b1!4m6!3m5!1s0x3bdba293d9d1139b:0x561ff6baa3d85381!8m2!3d19.8770487!4d75.3587304!16s%2Fg%2F11d_bbzc80?entry=ttu",
                "https://www.google.com/maps/place/Shahi+Bhoj+Thali+Restaurant/@19.8782508,75.3300746,14z/data=!3m1!5s0x3bdba2eceb1e1f63:0xcc5652fd179c90e5!4m10!1m2!2m1!1sBhoj+Restaurant!3m6!1s0x3bdba2eceaf6645f:0xb60bec2497728054!8m2!3d19.8782508!4d75.3661235!15sCg9CaG9qIFJlc3RhdXJhbnRaESIPYmhvaiByZXN0YXVyYW50kgEVcmFqYXN0aGFuaV9yZXN0YXVyYW504AEA!16s%2Fg%2F11gg6dpshs?entry=ttu",
                "https://www.google.com/maps/place/Citrus+Cafe/@19.8748494,75.3633205,17z/data=!3m1!4b1!4m6!3m5!1s0x3bdba2ed42eac7a5:0x65573ec0bcce90ea!8m2!3d19.8748444!4d75.3658954!16s%2Fg%2F11b75d221g?entry=ttu",
                "https://www.google.com/maps/place/Green+Leaf+Vegetarian+Cuisine/@19.8712958,75.344639,15z/data=!4m10!1m2!2m1!1sGreen+Leaf+Cuisine!3m6!1s0x3bdba2eca26601a3:0x14af702d5064679b!8m2!3d19.8793755!4d75.3659543!15sChJHcmVlbiBMZWFmIEN1aXNpbmVaFCISZ3JlZW4gbGVhZiBjdWlzaW5lkgERaW5kaWFuX3Jlc3RhdXJhbnSaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVUlRkSE5wY2xGUkVBReABAA!16s%2Fg%2F11b6q077s9?entry=ttu",
                "https://www.google.com/maps/place/Hotel+Gaurav+Maratha/@19.8713917,75.3137387,13z/data=!4m10!1m2!2m1!1sHotel+Gaurav+Maratha!3m6!1s0x3bdba3659ef5acb7:0x4e0bb80bee8430e8!8m2!3d19.8726732!4d75.3523946!15sChRIb3RlbCBHYXVyYXYgTWFyYXRoYVoWIhRob3RlbCBnYXVyYXYgbWFyYXRoYZIBCnJlc3RhdXJhbnTgAQA!16s%2Fg%2F11h8g47d9j?entry=ttu",
                "https://www.google.com/maps/place/Latitude/@19.1924888,73.9629196,9z/data=!4m10!1m2!2m1!1sLatitude!3m6!1s0x3bdbbd54b202192d:0xc04786c9d3298307!8m2!3d19.9075656!4d75.3463168!15sCghMYXRpdHVkZVoKIghsYXRpdHVkZZIBCnJlc3RhdXJhbnTgAQA!16s%2Fg%2F11g87c884m?entry=ttu",
                "https://www.google.com/maps/place/Royal+Rasoi/@19.8879877,75.3499481,17z/data=!3m1!4b1!4m6!3m5!1s0x3bdba293a428b801:0xed8f780968ea4a4e!8m2!3d19.8879827!4d75.352523!16s%2Fg%2F11j007tps8?entry=ttu",
                "https://www.google.com/maps/place/Tandoor+Restaurant+%26+Bar/@19.8644386,75.3140775,17z/data=!3m2!4b1!5s0x3bdb985de0d9c309:0xb292c113a5c39f46!4m6!3m5!1s0x3bdb985ddfc4fb43:0xf85be380594b3029!8m2!3d19.8644336!4d75.3166524!16s%2Fg%2F1v82_kjf?entry=ttu",
                "https://www.google.com/maps/place/Amigos+Kitchen/@19.8770537,75.3561555,17z/data=!3m1!4b1!4m6!3m5!1s0x3bdba293d9d1139b:0x561ff6baa3d85381!8m2!3d19.8770487!4d75.3587304!16s%2Fg%2F11d_bbzc80?entry=ttu",
                "https://www.google.com/maps/place/Dosa+Plaza/@19.8748743,75.3555956,15z/data=!4m10!1m2!2m1!1sD'Curry+House!3m6!1s0x3bdba2ee0f000001:0xabdfff827c170038!8m2!3d19.8767227!4d75.3717173!15sCg1EJ0N1cnJ5IEhvdXNlWg8iDWQgY3VycnkgaG91c2WSAQpyZXN0YXVyYW504AEA!16s%2Fg%2F11gfmw224g?entry=ttu",
                "https://www.google.com/maps/place/Royal+Rasoi/@19.8879877,75.3499481,17z/data=!3m1!4b1!4m6!3m5!1s0x3bdba293a428b801:0xed8f780968ea4a4e!8m2!3d19.8879827!4d75.352523!16s%2Fg%2F11j007tps8?entry=ttu",
                "https://www.google.com/maps/place/Tandoor+Restaurant+%26+Bar/@19.8644386,75.3140775,17z/data=!3m2!4b1!5s0x3bdb985de0d9c309:0xb292c113a5c39f46!4m6!3m5!1s0x3bdb985ddfc4fb43:0xf85be380594b3029!8m2!3d19.8644336!4d75.3166524!16s%2Fg%2F1v82_kjf?entry=ttu"
        };

        String[] budgetFriendlyBites = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Amigos Kitchen.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Basil Kitchen.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Chilli - The Skycourt Hotel.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\D'Curry House.png"
        };

        String[] cheapEats = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Athaang by Maple.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Bhoj Restaurant.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Citrus Cafe.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Green Leaf Cuisine.png"
        };

        String[] dinner = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Hotel Gaurav Maratha.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Latitude.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Royal Rasoi.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Tandoor Restaurant.png"
        };

        String[] deliveryAvailable = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Amigos Kitchen.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\D'Curry House.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Royal Rasoi.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\smbj_hotels\\Tandoor Restaurant.png"
        };





        // Call initializeFrame method from restaurent_func class
        restaurent_func.restaurenttemplate("Sambhaji nager",maplink, restaurantLinks, budgetFriendlyBites, cheapEats, dinner, deliveryAvailable);
    }

}
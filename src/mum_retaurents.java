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
public class mum_retaurents {

    public static void mum_restro()
    {
        String maplink = "https://www.google.com/maps/search/mumbai+restaurants/@19.0208078,72.7772194,12z/data=!3m1!4b1?entry=ttu";
        String[] restaurantLinks = {
                "https://www.google.com/maps/place/Bombay+Tandoori+Family+Restaurant/@19.1186353,72.8828589,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7c9a56da7dc59:0x3d7d65ea30e5432!8m2!3d19.1186302!4d72.8854338!16s%2Fg%2F11sn2htdn0?entry=ttu",
                "https://www.google.com/maps/place/Cafe+Madras%C2%AE%EF%B8%8F/@19.0276253,72.8504281,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7cf28fa60319d:0xf8101e76f66ded35!8m2!3d19.0276203!4d72.8550415!16s%2Fg%2F1tlbs5wz?entry=ttu",
                "https://www.google.com/maps/place/Colaba+SOCIAL/@18.921667,72.8297235,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7d1c0ea74b9bf:0x41c1d5b1ada97f8c!8m2!3d18.9216619!4d72.8322984!16s%2Fg%2F11bby4kzhy?entry=ttu",
                "https://www.google.com/maps/place/Leopold+Cafe/@18.9226453,72.8290652,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7d1c0fb6b23a9:0x1ccd311198f0c5a2!8m2!3d18.9226402!4d72.8316401!16s%2Fm%2F04zww53?entry=ttu",
                "https://www.google.com/maps/place/Mumbai+Express/@19.122828,72.8559095,14z/data=!4m10!1m2!2m1!1sMumbai+express+!3m6!1s0x3be7b80060f2fa67:0x7981ebf961dd5da5!8m2!3d19.122828!4d72.8919584!15sCg5NdW1iYWkgZXhwcmVzc1oQIg5tdW1iYWkgZXhwcmVzc5IBBGRlbGngAQA!16s%2Fg%2F1vyn2b65?entry=ttu",
                "https://www.google.com/maps/place/One8+Commune,+Juhu/@19.0895938,72.8233437,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7c96f0849c345:0x6e0276cc57b4b0ab!8m2!3d19.0895888!4d72.8279571!16s%2Fg%2F11t9k1wcs2?entry=ttu",
                "https://www.google.com/maps/place/Sardar+Pav+Bhaji/@18.9697752,72.812349,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7ce721ef94a37:0xdc867520d9057b37!8m2!3d18.9697701!4d72.8149239!16s%2Fg%2F1th5y81c?entry=ttu",
                "https://www.google.com/maps/place/Shamiana/@18.9220605,72.8304638,17z/data=!3m2!4b1!5s0x3be7d1c0c4d5ac1b:0x91caa6393a8c4b4f!4m6!3m5!1s0x3be7d1c0db257b5f:0xf1943ecedc05112!8m2!3d18.9220554!4d72.8330387!16s%2Fg%2F12633_jlq?entry=ttu",
                "https://www.google.com/maps/place/Shamiana/@18.9220605,72.8304638,17z/data=!3m2!4b1!5s0x3be7d1c0c4d5ac1b:0x91caa6393a8c4b4f!4m6!3m5!1s0x3be7d1c0db257b5f:0xf1943ecedc05112!8m2!3d18.9220554!4d72.8330387!16s%2Fg%2F12633_jlq?entry=ttu",
                "https://www.google.com/maps/place/The+Bay+View/@18.9312883,72.8205006,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7ce1e8741d455:0xbe039e3af7a9bf98!8m2!3d18.9312832!4d72.8230755!16s%2Fg%2F1tgfnlq8?entry=ttu",
                "https://www.google.com/maps/place/The+Bombay+Canteen/@19.0032501,72.8250011,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7ce8c350898ed:0x664c7200a24a00a9!8m2!3d19.003245!4d72.827576!16s%2Fg%2F11b75jff6j?entry=ttu",
                "https://www.google.com/maps/place/One8+Commune,+Juhu/@19.0895938,72.8233437,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7c96f0849c345:0x6e0276cc57b4b0ab!8m2!3d19.0895888!4d72.8279571!16s%2Fg%2F11t9k1wcs2?entry=ttu",
                "https://www.google.com/maps/search/amchi+mumbai/@19.1846286,72.6476331,10z/data=!3m1!4b1?entry=ttu",
                "https://www.google.com/maps/place/Colaba+SOCIAL/@18.921667,72.8297235,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7d1c0ea74b9bf:0x41c1d5b1ada97f8c!8m2!3d18.9216619!4d72.8322984!16s%2Fg%2F11bby4kzhy?entry=ttu",
                "https://www.google.com/maps/place/Leopold+Cafe/@18.9226453,72.8290652,17z/data=!3m1!4b1!4m6!3m5!1s0x3be7d1c0fb6b23a9:0x1ccd311198f0c5a2!8m2!3d18.9226402!4d72.8316401!16s%2Fm%2F04zww53?entry=ttu",
                "https://www.google.com/maps/place/Banjaara/@19.0064172,72.8191464,17z/data=!3m2!4b1!5s0x3be7ce96a1cafc53:0xa32405de6ba1f533!4m6!3m5!1s0x3be7ce96a1a394ab:0x81f898cb5da318d3!8m2!3d19.0064121!4d72.8217213!16s%2Fg%2F1tgllcg5?entry=ttu"




        };
        String[] budgetFriendlyBites = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Bombay Tandoori.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Cafe Madras.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Colaba Social.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Leopold Cafe.png"
        };
        String[] cheapEats = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Mumbai Express.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\One8 Commune.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Sardar Pav Bhaji.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Shamiana- The Taj Mahal Palace.png",
        };
        String[] dinner = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Shamiana- The Taj Mahal Palace.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\The Bay View.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\The Bombay Canteen.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\One8 Commune.png",

        };
        String[] deliveryAvailable = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Aamchi Mumbai.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Colaba Social.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Leopold Cafe.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\hotels_mum\\Banjaara.png"
        };

        // Call initializeFrame method from restaurent_func class
        restaurent_func.restaurenttemplate("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Restaurants in Mumbai.png","Mumbai",maplink, restaurantLinks, budgetFriendlyBites, cheapEats, dinner, deliveryAvailable);
    }

    public static void main(String[] args) {
        mum_restro();
    }
}

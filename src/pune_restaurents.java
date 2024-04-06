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

public class pune_restaurents {

    public static void pune_restro()
    {
        String maplink = "https://www.google.com/maps/search/Restaurants+in+Pune/@19.9846009,73.7883379,14.34z?entry=ttu";
        String[] restaurantLinks = {
                "https://www.google.com/maps/place/Bamboo+House/@18.5265802,73.8153191,14z/data=!4m10!1m2!2m1!1sBamboo+House!3m6!1s0x3bc2c07d03a20345:0x83353517c2528cd0!8m2!3d18.5265802!4d73.851368!15sCgxCYW1ib28gSG91c2VaDiIMYmFtYm9vIGhvdXNlkgEXbm9ydGhfaW5kaWFuX3Jlc3RhdXJhbnSaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVTmhkblJ4U2tkQkVBReABAA!16s%2Fg%2F1tfkjmfr?entry=ttu",
                "https://www.google.com/maps/place/Maratha+Samrat+-+Camp/@18.5347769,73.7867742,13z/data=!3m1!5s0x3bc2c05b48e390c1:0x8753f24898859939!4m10!1m2!2m1!1sMaratha+Samrat!3m6!1s0x3bc2c1359ce300c1:0xb2b4819079008966!8m2!3d18.520226!4d73.8724961!15sCg5NYXJhdGhhIFNhbXJhdCIDiAEBWhAiDm1hcmF0aGEgc2FtcmF0kgERaW5kaWFuX3Jlc3RhdXJhbnTgAQA!16s%2Fg%2F11kwr9_7rg?entry=ttu",
                "https://www.google.com/maps/place/Prem's+Restaurant/@18.8673392,73.0351189,10z/data=!3m1!5s0x3bc2c103e8d7bf1b:0x6f6809e33b9bf554!4m10!1m2!2m1!1sPrem's+Restaurant!3m6!1s0x3bc2c1067bbf7e4f:0x5799b7413125546b!8m2!3d18.5397994!4d73.893532!15sChFQcmVtJ3MgUmVzdGF1cmFudFoTIhFwcmVtJ3MgcmVzdGF1cmFudJIBF25vcnRoX2luZGlhbl9yZXN0YXVyYW504AEA!16s%2Fg%2F11cst1dyvf?entry=ttu",
                "https://www.google.com/maps/place/Tao-Fu/@18.5323199,73.8250309,17z/data=!3m2!4b1!5s0x3bc2bf70f2915199:0xe3cd1fd38420e2b6!4m6!3m5!1s0x3bc2bf6ed523fd25:0xd9dc9978358543fd!8m2!3d18.5323149!4d73.8296443!16s%2Fg%2F11s79l4cc8?entry=ttu",
                "https://www.google.com/maps/place/11+East+Street+Cafe/@18.5126293,73.8776207,17z/data=!3m1!4b1!4m6!3m5!1s0x3bc2c11122467bb1:0xf7da602ed178337a!8m2!3d18.5126242!4d73.8801956!16s%2Fg%2F11r8xj6cj?entry=ttu",
                "https://www.google.com/maps/place/Coriander+Kitchen/@18.5268439,73.7535161,12z/data=!4m10!1m2!2m1!1sCoriander+Restaurant!3m6!1s0x3bc2c0f92a9e79d1:0xb93b509be1d64d57!8m2!3d18.5351!4d73.883051!15sChRDb3JpYW5kZXIgUmVzdGF1cmFudFoWIhRjb3JpYW5kZXIgcmVzdGF1cmFudJIBEWJ1ZmZldF9yZXN0YXVyYW504AEA!16s%2Fg%2F11c13_rr5b?entry=ttu",
                "https://www.google.com/maps/place/High+Garden/@18.5346949,73.8253993,17z/data=!3m2!4b1!5s0x3bc2bf70c1e1e1bf:0x700fc6fe6e12d1d!4m6!3m5!1s0x3bc2bf02dc73734f:0x1e183e4f3b994c51!8m2!3d18.5346898!4d73.8279742!16s%2Fg%2F11qfr9h5kd?entry=ttu",
                "https://www.google.com/maps/place/Urban+Darbar/@18.563769,73.9126921,17z/data=!3m1!4b1!4m6!3m5!1s0x3bc2c1b79a2087a1:0xcac02649428a676c!8m2!3d18.5637639!4d73.915267!16s%2Fg%2F11p61vb5wg?entry=ttu",
                "https://www.google.com/maps/place/George+Restaurant/@18.5174086,73.8433113,14z/data=!4m10!1m2!2m1!1sGeorge+Restaurant!3m6!1s0x3bc2c04fa7f55113:0x71f5938ce54115b4!8m2!3d18.5174086!4d73.8793602!15sChFHZW9yZ2UgUmVzdGF1cmFudFoTIhFnZW9yZ2UgcmVzdGF1cmFudJIBEWZhbWlseV9yZXN0YXVyYW504AEA!16s%2Fg%2F1tj87wpf?entry=ttu",
                "https://www.google.com/maps/place/Tales+%26+Spirits/@18.5514641,73.7606782,12z/data=!4m10!1m2!2m1!1sTales+%26+Spirits!3m6!1s0x3bc2bf770d31b127:0xd4a7d36555ad9b61!8m2!3d18.530835!4d73.8286903!15sCg9UYWxlcyAmIFNwaXJpdHNaESIPdGFsZXMgJiBzcGlyaXRzkgENYmFyX2FuZF9ncmlsbOABAA!16s%2Fg%2F11bxfxw5p_?entry=ttu",
                "https://www.google.com/maps/place/Ukiyo/@18.5395433,73.8563983,13z/data=!3m1!5s0x3bc2c11e3e5721a3:0x9593809d7ecf3081!4m10!1m2!2m1!1sUkiyo!3m6!1s0x3bc2c19cbd6b9443:0x7209ea257a29b3df!8m2!3d18.5523193!4d73.8899421!15sCgVVa2l5b1oHIgV1a2l5b5IBE2phcGFuZXNlX3Jlc3RhdXJhbnTgAQA!16s%2Fg%2F11hgpbbvdc?entry=ttu",
                "https://www.google.com/maps/place/Wadeshwar/@18.5490112,73.8700757,14z/data=!4m10!1m2!2m1!1sWadeshwar!3m6!1s0x3bc2c113df90d8a9:0xa4d117ecb85567!8m2!3d18.5490112!4d73.9061246!15sCglXYWRlc2h3YXIiA4gBAVoLIgl3YWRlc2h3YXKSARdzb3V0aF9pbmRpYW5fcmVzdGF1cmFudOABAA!16s%2Fg%2F11btv69f1_?entry=ttu",
                "https://www.google.com/maps/place/Cafe+-+The+Voyage/@18.5394613,73.8950234,17z/data=!3m1!5s0x3bc2c105d3eedc11:0x255561f6f0fc680d!4m10!1m2!2m1!1sThe+Voyage!3m6!1s0x3bc2c1e516534ca9:0x6dd1b2112e4c4e04!8m2!3d18.5394559!4d73.8976008!15sCgpUaGUgVm95YWdlWgwiCnRoZSB2b3lhZ2WSAQRjYWZl4AEA!16s%2Fg%2F11v3db28cd?entry=ttu",
                "https://www.google.com/maps/place/11+East+Street+Cafe/@18.5126293,73.8776207,17z/data=!3m1!4b1!4m6!3m5!1s0x3bc2c11122467bb1:0xf7da602ed178337a!8m2!3d18.5126242!4d73.8801956!16s%2Fg%2F11r8xj6cj?entry=ttu",
                "https://www.google.com/maps/place/Maratha+Samrat+-+Camp/@18.5347769,73.7867742,13z/data=!3m1!5s0x3bc2c05b48e390c1:0x8753f24898859939!4m10!1m2!2m1!1sMaratha+Samrat!3m6!1s0x3bc2c1359ce300c1:0xb2b4819079008966!8m2!3d18.520226!4d73.8724961!15sCg5NYXJhdGhhIFNhbXJhdCIDiAEBWhAiDm1hcmF0aGEgc2FtcmF0kgERaW5kaWFuX3Jlc3RhdXJhbnTgAQA!16s%2Fg%2F11kwr9_7rg?entry=ttu",
                "https://www.google.com/maps/place/Prem's+Restaurant/@18.8673392,73.0351189,10z/data=!3m1!5s0x3bc2c103e8d7bf1b:0x6f6809e33b9bf554!4m10!1m2!2m1!1sPrem's+Restaurant!3m6!1s0x3bc2c1067bbf7e4f:0x5799b7413125546b!8m2!3d18.5397994!4d73.893532!15sChFQcmVtJ3MgUmVzdGF1cmFudFoTIhFwcmVtJ3MgcmVzdGF1cmFudJIBF25vcnRoX2luZGlhbl9yZXN0YXVyYW504AEA!16s%2Fg%2F11cst1dyvf?entry=ttu"

        };

        String[] budgetFriendlyBites = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Bamboo House.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Maratha Samrat.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Prem's Restaurant.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Tau-Fu.png"
        };

        String[] cheapEats = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\11 East Street Cafe.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Coriander Restaurant.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\High Garden.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Urban Darbar.png"
        };

        String[] dinner = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\George Restaurant.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Tales & Spirits.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Ukiyo.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Wadeshwar.png"
        };

        String[] deliveryAvailable = {
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\The Voyage.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\11 East Street Cafe.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Maratha Samrat.png",
                "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\nashik_hotels\\Prem's Restaurant.png"
        };



        restaurent_func.restaurenttemplate("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Restaurants in Pune.png","Pune",maplink, restaurantLinks, budgetFriendlyBites, cheapEats, dinner, deliveryAvailable);
    }

}
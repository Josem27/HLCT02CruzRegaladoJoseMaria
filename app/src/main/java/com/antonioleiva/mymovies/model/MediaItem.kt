package com.antonioleiva.mymovies.model

import com.antonioleiva.mymovies.model.MediaItem.Type

data class MediaItem(
    val id: Int,
    val title: String,
    val thumb: String,
    val type: Type,
    val author: String? = null,
    val description: String? = null
) {
    enum class Type { PHOTO, VIDEO }
}

fun getMedia(): List<MediaItem> {
    return listOf(
        MediaItem(
            id = 1,
            title = "Carrera Nocturna",
            thumb = "https://s1.sportstatics.com/relevo/www/multimedia/202311/21/media/cortadas/verstappen-RaG4DCHFRVicdUkHIFfjc8N-1200x648@Relevo.jpg",
            type = Type.VIDEO,
            author = "Pepe",
            description = "Emocionante carrera nocturna bajo las luces del circuito de Las Vegas"
        ),
        MediaItem(
            id = 2,
            title = "Detrás de Escena",
            thumb = "https://phantom-marca.unidadeditorial.es/efa333df293aee1e9f66f65d39218afb/crop/0x0/2044x1363/resize/828/f/jpg/assets/multimedia/imagenes/2023/06/30/16881258967394.jpg",
            type = Type.VIDEO,
            author = "Jose",
            description = "Acceso exclusivo detrás de escena en el paddock de la F1 con los mejores pilotos"
        ),
        MediaItem(
            id = 3,
            title = "Duelo de Titanes",
            thumb = "https://cdn-images.motor.es/image/m/800w.webp/fotos-noticias/2021/08/duelo-hamilton-alonso-mas-alla-limite-siempre-queja-202180097-1627908941_1.jpg",
            type = Type.VIDEO,
            author = "Pedro",
            description = "Increíble duelo entre dos pilotos legendarios, dos leyendas codo con codo hasta el final"
        ),
        MediaItem(
            id = 4,
            title = "Adrenalina en Monaco",
            thumb = "https://www.visitmonaco.com/ImageRepository/Itineraire/1b423c19-777c-4a5d-938d-f3dba9ec9732/Slider/3-fotolia-84608102-subscription-yearly-xxl.jpg?Width=2500&Height=1250",
            type = Type.VIDEO,
            author = "Pepe",
            description = "Recorrido a alta velocidad por las calles de Mónaco, el legendario circuito urbano"
        ),
        MediaItem(
            id = 5,
            title = "Innovación Tecnológica",
            thumb = "https://www.elplural.com/uploads/s1/15/69/99/7/z91-0558-copy_4_800x450.jpeg",
            type = Type.VIDEO,
            author = "Admin",
            description = "Descubre las últimas innovaciones tecnológicas en la F1, desde aerodinamicas hasta chasis"
        ),
        MediaItem(
            id = 6,
            title = "Lluvia en Silverstone",
            thumb = "https://cdn-2.motorsport.com/images/amp/0a9Pzbw0/s6/formula-1-canadian-gp-2023-cha-2.jpg",
            type = Type.VIDEO,
            author = "UserF1",
            description = "Carrera épica bajo la lluvia en Silverstone, dejando mas de un accidentado al paso"
        ),
        MediaItem(
            id = 7,
            title = "Velocidad en Monza",
            thumb = "https://img.redbull.com/images/q_auto,f_auto/redbullcom/2021/9/6/r2ndffkp9mlw8jh6wbr3/monza-circuito-formula-1-gran-premio-italia",
            type = Type.VIDEO,
            author = "Pepe",
            description = "Los momentos más rápidos en la pista de Monza, viviendolo desde los Tifosi"
        ),
        MediaItem(
            id = 8,
            title = "Celebración en el Podio",
            thumb = "https://static.motor.es/fotos-noticias/2023/11/podio-con-sabor-a-victoria-para-fernando-alonso-tras-una-lucha-historica-nos-mereciamos-una-alegria-202398397-1699216037_1.jpg",
            type = Type.VIDEO,
            author = "Admin",
            description = "Vibrante celebración en el podio tras una victoria emocionante, 100 podios de Fernando Alonso"
        ),
        MediaItem(
            id = 9,
            title = "Aerodinámica en Acción",
            thumb = "https://cdn-3.motorsport.com/images/amp/0a9nzRw0/s1000/2021-2022-downforce-distributi.jpg",
            type = Type.VIDEO,
            author = "Pedro",
            description = "Análisis detallado de la aerodinámica de los monoplazas en la F1, flujo de aire, carga..."
        ),
        MediaItem(
            id = 10,
            title = "Retro F1",
            thumb = "https://hips.hearstapps.com/es.h-cdn.co/cades/contenidos/5047/f1-jarama-1967.jpg?crop=0.6666666666666666xw:1xh;center,top&resize=1200:*",
            type = Type.VIDEO,
            author = "Pedro",
            description = "Revive momentos históricos con este especial de F1 retro, Schumacher, Senna, Frost..."
        )
    )
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Random;

/**
 *
 * @author Duoc UC
 */
public class frases {

    public static String[] frases = {
        "El miedo es el camino hacia el lado oscuro. El miedo lleva a la ira, la ira lleva al odio, el odio lleva al sufrimiento.- Yoda",
        "Senadores, supongo que ustedes están familiarizadso con la colección de medias verdades y la hipérbole conocidos como Obi-Wan Kenobi.- Duquesa Satine",
        "Mucho que aprender todavía tienes.- Yoda",
        "Tu enfoque determina tu realidad.- Qui-Gon Jinn",
        "Siempre hay un pez más grande.- Qui-Gon Jinn",
        "Alguien tiene que salvarnos el pellejo.- Leia Organa",
        "Las religiones y las armas antiguas no son rival para un buen desintegrador a tu lado, chico.-Han Solo",
        "Tengo un mal presentimiento sobre esto.- Han Solo",
        "¿Quién es más tonto: el tonto, o el tonto que lo sigue?.- Obi-Wan Kenobi",
        "Cuando nos fijamos en el lado oscuro, debemos ser cuidadosos… el lado oscuro mira hacia atrás.- Yoda",
        "En mi experiencia, no hay tal cosa como la suerte.- Obi-Wan Kenobi",
        "Encuentro tu falta de fe perturbadora.- Darth Vader",
        "Es verdaderamente maravilloso lo que la mente de un niño es capaz de hacer y creer.- Yoda",
        "¡Es una trampa!- Almirante Ackbar",
        "El tamaño no importa. Mírame. A mí me juzgan por mi tamaño, ¿Tú lo haces?- Yoda",
        "Y así es como muere la libertad… con aplausos.- Padmé Amidala",
        "La muerte es parte natural de la vida. Alégrate de los que te rodean, quienes se transforman en la Fuerza.- Yoda",
        "Tus ojos pueden engañarte. No confíes en ellos.- Obi-Wan Kenobi",
        "Va en contra de mi programación hacerme pasar por una deidad.- C-3PO",
        "Nunca me digas las probabilidades.- Han Solo",
        "Los trucos mentales no funcionan en mí.- Watto",
        "Un Jedi debe tener el compromiso más profundo, la mente más seria… Toda su vida tiene que desviar la mirada hacia el futuro, hacia el horizonte. Nunca su mente debe quedarse donde estaba o en lo que estaba haciendo.- Yoda.",
        "Las mujeres siempre averiguan la verdad. Siempre.- Han Solo",
        "Este es un nuevo día, un nuevo comienzo.- Ahsoka Tano",
        "Creo que mis ojos son cada vez mejores. En lugar de una gran mancha oscura, veo una gran mancha de luz.-Han Solo",
        "Es verdad. Todo ello. El lado oscuro, los Jedi. Son reales.-Han Solo",
        "La fuerza no es ni la luz ni la oscuridad, sino un equilibrio entre los extremos.- LANOREE BROCK",
        "Cuando mires al lado oscuro, cuidado debes tener… ya que el lado oscuro te mira también.-Yoda",
        "Que la fuerza esté contigo… siempre.- Obi-Wan Kenobi",
        "Paciencia debe tener, mi joven padawan.- Yoda",
        "El honor es el premio de un tonto. La gloria no da ninguna utilidad a los muertos.- Drew Karpyshyn",
        "He vivido lo suficiente para ver los mismos ojos en diferentes personas.- MAZ Kanata",
        "Es mejor morir en la búsqueda de sus sueños que vivir una vida sin esperanza.- Terry Brooks",
        "¿No eres un poco corto para un soldado de asalto?- Princesa Leia",
        "A veces hay que dejar de lado el orgullo y hacer lo que se nos pide.- Anakin Skywalker",
        "Siempre en movimiento el futuro esta.- Yoda",
        "Bueno, confía en un robot para llegar al fondo de las cosas.- Han Solo",
        "Algún día vas a estar mal, yo solo espero estar allí para verlo.- Princesa Leia",
        "No hay campo de energía mística que controle mi destino.- Han Solo",
        "Imposible nada es. Difícil, muchas cosas son.- Yoda",
        "Yo no sé de dónde sacas tus ideas delirantes, cerebro láser.- Princesa Leia",
        "Ya sabes lo que digo siempre… habla en voz baja, y conduce un tanque grande.- Hondo Ohnaka",
        "Cuida de tí mismo, Han. Supongo que eso es lo mejor ¿no es así?- Luke Skywalker",
        "Entre los hijos de los Jedi, no hay inocentes.- Darth Sidious",
        "Cuando el camino inseguro es, mejor esperar debemos.- Yoda",
        "¿Sería útil si salgo y empujo?- Leia",
        "Entrénate para dejar de lado todo lo que temes perder.- Yoda",
        "La codicia puede ser un aliado muy poderoso. -Qui-Gon Jinn",
        "Olvidar debes lo que has aprendido.- Yoda",
        "Recuerda, debes concentrarte en el momento. Siente, no pienses, usa tus instintos.- Qui-Gon Jinn",
        "Si al final de tu entrenamiento, eliges la ruta de acceso rápido y fácil como lo hizo Vader, te convertirás en un agente del mal.-Yoda",
        "Las guerras no hacen grande a nadie.- Yoda",
        "La capacidad de hablar no te hace inteligente.- Qui-Gon Jinn",
        "Usa la fuerza, Luke.- Obi-Wan",
        "Muchas de las verdades se aferran a depender de nuestro punto de vista.- Obi-Wan Kenobi",
        "Yo puedo sentir tu ira. Hace que te concentres. Te hace más fuerte.- Chancellor Palpatine",
        "Se consciente de tus pensamientos, Anakin. Ellos te traicionarán.- Obi-Wan",
        "La compasión, que yo definiría como amor incondicional, es esencial para la vida de un Jedi. Así que se podría decir que se nos anima a amar.- Anakin",
        "Cuando te dejé, yo no era más que el aprendiz. Ahora yo soy el amo.- Darth Vader",
        "Yo soy un Jedi, como mi padre antes que yo.- Lucas",
        "Sirve a tu amo también. Y serás recompensado.- Lucas",
        "No soy un comité.- Princesa Leia",
        "Yo no aprobaría un curso de acción que nos conduciría a la guerra.- Reina Amidala",
        "No te dejaré ahora. Tengo que salvarte.- Lucas",
        "Ahora, a ser valiente y no mirar hacia atrás.- Shmi Skywalker",
        "No fue elegido para ver mis personas sufrir y morir mientras charlas sobre esta invasión en un comité.- Reina Amidala",
        "Usted tiene sus momentos. No muchos de ellos, pero los tiene.- Princesa Leia",
        "¿Por qué tengo la sensación de que vas a ser la muerte para mí.- Obi-Wan",
        "Eres lo más cercano que tengo a un padre… Te amo. No quiero causarte dolor.- Anakin",
        "Quiero ir a casa y replantear mi vida.- Elan Sleazebaggano",
        "No hay escape. No me hagas que te destruya.- Darth Vader",
        "No me gusta esta idea de su escondite.- Padmé",
        "Estaba empezando a preguntarme si recibiste mi mensaje.- Obi-Wan",
        "No, yo soy tu padre.- Darth Vader",
        "No necesitas orientación, Anakin. Con el tiempo, aprenderá a confiar en tus sentimientos. Entonces, usted será invencible.- Palpatine",
        "Cuando estoy cerca de ti, mi mente ya no es mía.- Anakin",
        "Simplemente relajarse, concentrarse.- Obi-Wan",
        "Yo no era lo suficientemente fuerte como para salvarte madre. No era lo suficientemente fuerte, pero te prometo que no voy a volver a fallar.- Anakin",
        "Únete a mí, y voy a completar tu formación. Con nuestra fuerza combinada, podemos poner fin a este conflicto destructivo y poner orden en la galaxia.- Darth Vader",
        "Lo he dicho muchas veces, que son los Jedi más dotados que he conocido.- Palpatine",
        "Lo siento, señor. Olvidé que no le gusta volar.- Anakin",
        "Eso fue valiente, muchacho, pero tonto. Yo habría pensado que habrías aprendido la lección.- Conde Dooku",
        "Bueno… supongo que soy tu hermanastro. Tenía la sensación de que podría aparecer algún día.- Owen Lars",
        "Si usted está sufriendo tanto como yo, por favor dígame.- Anakin",
        "Debe ser difícil después de haber jurado su vida a los Jedi… no poder visitar los lugares que les gusta… o hacer lo que le gusta.- Padmé",
        "Vas a pagar por todos los Jedi que mataste hoy, Dooku.- Anakin",
        "¿Me amas? Pensé que había decidido no caer en el amor.- Anakin",
        "No tengo miedo a morir. He estado muriendo un poco cada día desde que volviste a mi vida.- Padmé",
        "Me está pidiendo ser racional. Sé que es algo que no puedo hacer.- Anakin",
        "No permiten que pierda su futuro para mí.- Padmé",
        "Anakin. No dejes que tus sentimientos personales se interpongan en el camino.- Obi-Wan",
        "Sus espadas, por favor. Usted no quiere hacer un lío de cosas frente a la Canciller.- Conde Dooku",
        "Esta vez lo haremos juntos.- Obi-Wan",
        "Lord Vader, nuestras naves han completado su exploración de la zona y no han encontrado nada.- Almirante Piett",
        "Hay una gran perturbación en la Fuerza.- Emperador Palpatine",
        "¿Qué pasa si no sobrevive? Él vale mucho para mí.- Fett Boba",
        "Sería un honor si desea unirse a nosotros.- Darth Vader :",
        "Ven conmigo. Deja todo atrás.- Lucas",
        "Necesito más hombres.- Moff Jerjerrod",
        "Debería ser más paciente, maestro. Después de todo, el conde es un señor de edad y no se mueve como lo hacía antes.- Anakin",
        "Todos los mentores tieden a ver nuestros errores más de lo que nos gustaría. Es la única manera de crecer-. Padme",
        "Preparado estás? ¿Qué sabes tú de estar preparado? Durante ochocientos años he entrenado a los Jedi. Yo decidiré quién debe ser entrenado.-Yoda.",
        "¿Tú crees que Yoda deja de enseñar, sólo porque su estudiante no quiere escuchar? Un maestro Yoda es. Yoda enseña como los borrachos beben, como los asesinos matan.-Yoda.",
        "Ella puede no parecer mucho, pero lo tiene en los momentos importantes.- Han Solo",
        "Obi Wan Kenobi",
        "Si hay un centro brillante del universo, está en el planeta que está más alejado de él.- Luke Skywalker",
        "Viajar por el hiperespacio no es como quitar polvo de los cultivos, muchacho de granja.- Han Solo",
        "La pertenencia que buscas no está detrás de ti… está por delante.- Maz Kanata",
        "Un Jedi muy sabio dijo una vez que nada sucede por accidente.- Anakin",
        "Ningún equipo está libre de culpa. Se necesitan dos para luchar.- Tee Watt Kaa",
        "Morir por un pueblo es un gran sacrificio. Pero vivir para un pueblo, un sacrificio aún mayor.- Riyo Chuchi",
        "Si sacrificamos nuestro código, incluso por la victoria, podemos perder lo que es más importante, nuestro honor.- Obi-Wan",
        "¿Pero no es la libertad por lo que vale la pena luchar?- Aayla Secura",
        "Ella debe haber ocultado los planes en la cápsula de escape. Envía un destacamento hacia abajo para recuperarlos. No habrá nadie que nos detenga este momento.- Darth Vader",
        "Este será un día recordado por mucho tiempo. Se ha visto el final de Kenobi y muy pronto se verá el final de la Rebelión.- Darth Vader"
    };

    public frases() {}

    
    
    Random ran = new Random();
    public String starfrase(){
        return frases[ran.nextInt(114)];
    }
    
    
}

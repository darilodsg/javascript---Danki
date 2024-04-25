
var nomes = ['Danilo', 'José', 'Paulo']
/*
for(var n = 0; n < nomes.length; n++)
{
    console.log(`Na posição ${n} tem o nome: ${nomes[n]}`)
}
*/
nomes.forEach(function(value,index){

    console.log(value, index);
})
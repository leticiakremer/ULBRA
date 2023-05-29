$(document).ready(function () {

  $(document).ready(() => {
    $('section').load('home.html')
    $('#menuHome').addClass('active')
  })

  $('#menuCalculadora').click(function () {
    $('section').load('calculadora.html', function () {
      $('#calcular').click(function () {
        var n1 = Number($('#n1').val())
        var n2 = Number($('#n2').val())
        var operacao = $('#operacao').val()
        var resultado

        switch (operacao) {
          case '+':
            resultado = n1 + n2
            break;
          case '-':
            resultado = n1 - n2
            break;
          case '*':
            resultado = n1 * n2
            break;
          case '/':
            resultado = n1 / n2
            break;
        }

        $('#resultado').html(resultado)
      })
    })
  })

  $('#menuIdade').click(function () {
    $('section').load('idades.html', function () {
      var idadeInput = $('#idade')
      var idadeButton = $('#verifica_idade')
      var mostraIdadeDiv = $('#mostrarIdade')
      idadeButton.click(() => {
        mostraIdadeDiv.empty()
        var idade = idadeInput.val()
        if (idade >= 18) {
          mostraIdadeDiv.append('Você é maior de idade!')
        } else {
          mostraIdadeDiv.append('Você é menor de idade!')
        }
      })
    })
  })

  $('#menuMaiorNumero').click(function () {
    $('section').load('verifica_maior.html', function () {
      var primeiroNumInput = $('#primeiro-numero')
      var segundoNumInput = $('#segundo-numero')
      var mostrarMaiorButton = $('#verifica_maior')
      var mostrarMaiorDiv = $('#maiorNumero')
      mostrarMaiorButton.click(() => {
        mostrarMaiorDiv.empty()
        var primeiroNum = primeiroNumInput.val()
        var segundoNum = segundoNumInput.val()
        if (primeiroNum > segundoNum) {
          mostrarMaiorDiv.append('Este é o maior número ' + primeiroNum)
          console.log(primeiroNum)
        } else {
          mostrarMaiorDiv.append('Este é o maior número ' + segundoNum)
          console.log(segundoNum)
        }
      })

    })

  })

  $(document).ready(() => {
    $('section').load('home.html')
    $('#menuHome').addClass('active')
  })

})
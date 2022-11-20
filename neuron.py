
from math import exp
from random import random

activationF = lambda x : 1 / (1 + exp(-1 * x))
bias_map = [True, True, False]



class neuron:
    # def __init__(self, name:str, f_request:dict, produce:dict):
    layer = None
    value = 1
    error_value = 1
    link_prev = []
    link_next = []
    its_bias = False

class neuron_layer:   
    neurons = []


class link_neuron:
    def __init__(self, layer, first_neuron:neuron, second_neuron:neuron):
        self.value = random ()
        self.link_layer = layer
        self.first_neuron = first_neuron
        self.second_neuron = second_neuron

        first_neuron.link_next.append((self, second_neuron))
        second_neuron.link_prev.append((first_neuron, self))

class neuron_matrix:
    def __init__(self, neural_matrix_init:list):    

        self.all_layers: neuron_layer = [] 
        self.all_neurons: neuron = []
        self.all_links: link_neuron = []

        for layer, neuron_total in enumerate(neural_matrix_init):
            neuron_total += bias_map[layer]
            self.all_neurons.append([])
            self.all_layers.append(neuron_layer())
            for i in range(neuron_total):
                n = neuron()
                n.layer = layer
                self.all_layers[layer].neurons.append(n)
                self.all_neurons[layer].append(n)
                if i == 0:
                    n.its_bias = bias_map[layer]

        for l in range(len(self.all_layers)):
            if l < len(self.all_layers)-1:
                self.all_links.append([])
                for first in self.all_layers[l].neurons:
                    for second in self.all_layers[l+1].neurons:
                        if not second.its_bias:
                            link = link_neuron(l, first, second)
                            self.all_links[l].append(link)
    

if __name__ == '__main__':
    

    matrix = neuron_matrix([3, 4, 5])

    # print (matrix.all_layers.neurons)

    

        

            
            


    # l = neuron_layer
    # n = neuron
    # n.layer = l

    # print(l.a)
    # print(n.layer.a)
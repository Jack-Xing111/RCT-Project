import matplotlib
import matplotlib.pyplot as plt
import random
#import seaborn as sns

def main():

    plt.style.use('fivethirtyeight')
    matplotlib.rcParams['lines.linewidth'] = 2
    matplotlib.rcParams['axes.titlesize'] = 'small'
    #sns.set_style({'font.sans-serif': ['simhei', 'Arial']})

    fig = plt.figure(figsize=(12, 12), dpi=100)
      #该行可以换成 ax1 = fig.add_subplot(2,2,1)
    #设置X轴、Y轴的刻度范围
    #ax1.set_ylim(0, 1)
    #ax1.set_xlim(0, 1)
    #设置每个刻度对应的标签
    #plt.xticks([1, 2, 3, 4], labels=["a", "b", "c", "d"])

    
    x = []
    y = []
    y1 = []
    for i in range(300):
        x.append(i)

    y += [1.5, 74.3, 101.11, 105.2]
    y1 += [1.7, 88.22, 121.11, 123.24]

    for i in range(5):
        y.append(y[-1] + random.uniform(3,5))
        y1.append(y1[-1] - random.uniform(3.5,6))

    y[-1] = y[-1] - 5
    
    for i in range(7):
        y.append(y[-1] - random.uniform(3,5))
        y1.append(y1[-1] - random.uniform(2,4))
    
    y += [180.2, 192.4, 202.3]
    y1 += [185.4, 192.3, 208]

    for i in range(5):
        y.append(y[-1] - random.uniform(4,6))
        y1.append(y1[-1] - random.uniform(5,8))

    for i in range(7):
        y.append(y[-1] + random.uniform(-5,5))
        y1.append(y1[-1] + random.uniform(-8,8))

    y += [250.4, 264.3]
    y1 += [283.5, 291.3]

    for i in range(267):
        y.append(y[-1] - random.uniform(-2,2))
        y1.append(y1[-1] - random.uniform(-2.2,2.2))



    x_ = []
    y_ = []
    y1_ = []
    for i in range(300):
        x_.append(i)

    y_ += [1.5, 34.8, 46.3]
    y1_ += [1.3, 33.2, 50.4]

    for i in range(3):
        y_.append(y_[-1] - random.uniform(5,8))
        y1_.append(y1_[-1] - random.uniform(6,10))

    for i in range(10):
        y_.append(y_[-1] + random.uniform(-4,4))
        y1_.append(y1_[-1] + random.uniform(-6,6))
    
    y_ += [60.1, 73.2, 79.5]
    y1_ += [76.8, 78.3, 83.3]

    for i in range(2):
        y_.append(y_[-1] - random.uniform(3.5,5))
        y1_.append(y1_[-1] - random.uniform(4,6))

    for i in range(10):
        y_.append(y_[-1] + random.uniform(-4,4))
        y1_.append(y1_[-1] + random.uniform(-6,6))

    y_ += [112.22, 123.4]
    y1_ += [114.16, 123.2]

    for i in range(267):
        y_.append(y_[-1] - random.uniform(-1.5,1.5))
        y1_.append(y1_[-1] - random.uniform(-1.5,1.5))

################################
    xx = []
    yy = []
    yy1 = []
    for i in range(300):
        xx.append(i)

    yy += [1.5, 73.3, 96.11, 100.2]
    yy1 += [1.7, 80.22, 101.11, 111.24]

    for i in range(5):
        yy.append(yy[-1] + random.uniform(4,5))
        yy1.append(yy1[-1] - random.uniform(4.5,6))

    for i in range(7):
        yy.append(yy[-1] - random.uniform(1,3))
        yy1.append(yy1[-1] - random.uniform(2,5))
    
    yy += [193, 201.22, 223.33]
    yy1 += [201.8, 227.2, 242.2]

    for i in range(5):
        yy.append(yy[-1] - random.uniform(4,8))
        yy1.append(yy1[-1] - random.uniform(5,10))

    for i in range(7):
        yy.append(yy[-1] + random.uniform(-5,5))
        yy1.append(yy1[-1] + random.uniform(-8,8))

    yy += [250.9, 273.2]
    yy1 += [267.22, 290.3]

    for i in range(267):
        yy.append(yy[-1] + random.uniform(-2.5,2.5))
        yy1.append(yy1[-1] - random.uniform(-2.6,2.6))


    xx_ = []
    yy_ = []
    yy1_ = []
    for i in range(300):
        xx_.append(i)

    yy_ += [1.5, 158.8, 186.3]
    yy1_ += [1.3, 180.4, 205.4]

    for i in range(3):
        yy_.append(yy_[-1] - random.uniform(5,8))
        yy1_.append(yy1_[-1] - random.uniform(6,10))

    for i in range(10):
        yy_.append(yy_[-1] + random.uniform(-4,4))
        yy1_.append(yy1_[-1] + random.uniform(-6,6))
    
    yy_ += [257, 263.2, 279.5]
    yy1_ += [283.3, 297.3, 301.4]

    for i in range(2):
        yy_.append(yy_[-1] + random.uniform(3.5,4.5))
        yy1_.append(yy1_[-1] - random.uniform(4,5.5))

    for i in range(10):
        yy_.append(yy_[-1] + random.uniform(-4,4))
        yy1_.append(yy1_[-1] + random.uniform(-6,6))

    yy_ += [401.5, 413.4]
    yy1_ += [412.2, 423.2]

    for i in range(267):
        yy_.append(yy_[-1] - random.uniform(-3,3))
        yy1_.append(yy1_[-1] - random.uniform(-3.5,3.5))
    

    plt.plot(x_, y_, color='black', linestyle="-", label = 'iTBS Research')
    plt.plot(x_, y1_, color='red', linestyle="-", label = 'Engage Prism 2.0 Research')
    plt.plot(xx_, yy_, color='green', linestyle="-", label = 'Methylphenidate Research')
    plt.plot(xx_, yy1_, color='orange', linestyle="-", label = 'Fluticasone Research')
    plt.plot(x, y1, color='blue', linestyle="-", label = 'OCEAN Research')
    plt.plot(xx, yy, color='yellow', linestyle="-", label = 'Antibody Plasma Research')
    plt.ylabel('Memory usage(MB)') # 横坐标轴的标题
    plt.xlabel('Time(s)') # 纵坐标轴的标题
    plt.legend()
    



    fig.suptitle('Memory Usage Overview', y=0.98)  # 设置大标题及位置
 
    
    #for i in range(282):
    #    y.append(random.randrange(1,2))
    #    y1.append(random.randrange(1,2))
    # 以下两种写法等价，
    
    plt.show()

main()


